package com.lancamentocaixav3.treino.service;

import com.lancamentocaixav3.treino.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteService extends JpaRepository<Cliente, Integer> {
}
