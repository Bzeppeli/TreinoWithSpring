package com.lancamentocaixav3.treino.service;

import com.lancamentocaixav3.treino.model.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuarioService extends PagingAndSortingRepository<Usuario, Integer> {

    public Usuario findByNome(String nome);
    public Usuario findByEmail(String email);
    Usuario findByLogin(String login);
}
