package com.lancamentocaixav3.treino.service;

import com.lancamentocaixav3.treino.model.Contabil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContabilService extends JpaRepository<Contabil, Integer> {
}
