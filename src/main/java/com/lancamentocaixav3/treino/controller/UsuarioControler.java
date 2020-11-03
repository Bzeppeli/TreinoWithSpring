package com.lancamentocaixav3.treino.controller;

import com.lancamentocaixav3.treino.model.Usuario;
import com.lancamentocaixav3.treino.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("usuario")
public class UsuarioControler {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public Iterable<Usuario> read(){
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> find(@PathVariable Integer id){
        return usuarioService.findById(id);
    }

    @GetMapping("/{nome}")
    public Usuario findNome(@PathVariable String nome){
        return usuarioService.findByNome(nome);
    }

    @GetMapping("/{email}")
    public Usuario findEmail(@PathVariable String email){
        return usuarioService.findByNome(email);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        if(usuarioService.findById(usuario.getId()).isPresent()){
            return new ResponseEntity(usuarioService.save(usuario), HttpStatus.OK);
        }else{
            return new ResponseEntity(usuario, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        usuarioService.deleteById(id);
    }
}
