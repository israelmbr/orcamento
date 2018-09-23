package com.israel.orcamento;

import com.israel.orcamento.domain.Classificacao;
import com.israel.orcamento.repositories.ClassificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OrcamentoApplication implements CommandLineRunner {

    @Autowired
    private ClassificacaoRepository classificacaoRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrcamentoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Classificacao cla1 = new Classificacao(1, "Alimentação", "Almoço");
        Classificacao cla2 = new Classificacao(2, "Outras", "Outras");

        classificacaoRepository.saveAll(Arrays.asList(cla1,cla2));
    }
}
