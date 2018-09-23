package com.israel.orcamento.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/classificacoes")
public class ClassificacaoResource {

    @RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "REST está funcionando!";
    }
}
