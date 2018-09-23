package com.israel.orcamento.resources;

import com.israel.orcamento.domain.Classificacao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/classificacoes")
public class ClassificacaoResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Classificacao> listar() {
        Classificacao cla1 = new Classificacao(1, "Alimentação", "Almoço");
        Classificacao cla2 = new Classificacao(1, "Outras", "Outras");

        List<Classificacao> lista = new ArrayList<>();

        lista.add(cla1);
        lista.add(cla2);

        return lista;
    }
}
