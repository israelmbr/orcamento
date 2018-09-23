package com.israel.orcamento.services;

import com.israel.orcamento.domain.Classificacao;
import com.israel.orcamento.repositories.ClassificacaoRepository;
import com.israel.orcamento.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassificacaoService {

    @Autowired
    private ClassificacaoRepository classificacaoRepository;

    public Classificacao buscar(Integer id) {
        Optional<Classificacao> classificacao = classificacaoRepository.findById(id);

        return classificacao.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Classificacao.class.getName()));

    }
}
