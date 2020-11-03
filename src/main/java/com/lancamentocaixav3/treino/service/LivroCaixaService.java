package com.lancamentocaixav3.treino.service;

import com.lancamentocaixav3.treino.model.LivroCaixa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroCaixaService extends JpaRepository<LivroCaixa, Integer> {
}
