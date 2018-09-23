package com.israel.orcamento.repositories;

import com.israel.orcamento.domain.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificacaoRepository extends JpaRepository<Classificacao, Integer> {
}
