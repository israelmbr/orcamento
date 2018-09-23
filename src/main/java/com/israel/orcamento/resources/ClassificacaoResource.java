package com.israel.orcamento.resources;

import com.israel.orcamento.domain.Classificacao;
import com.israel.orcamento.services.ClassificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/classificacoes")
public class ClassificacaoResource {

    @Autowired
    private ClassificacaoService classificacaoService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Classificacao classificacao = classificacaoService.buscar(id);

        return ResponseEntity.ok().body(classificacao);
    }
}
