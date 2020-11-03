package com.lancamentocaixav3.treino.controller;

import com.lancamentocaixav3.treino.model.Cliente;
import com.lancamentocaixav3.treino.model.Contabil;
import com.lancamentocaixav3.treino.model.LivroCaixa;
import com.lancamentocaixav3.treino.service.ClienteService;
import com.lancamentocaixav3.treino.service.ContabilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;


    @GetMapping
    public Iterable<Cliente> read(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findId(@PathVariable Integer id){
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PostMapping("/ct")
    public Cliente createClienteWithContabil(@RequestBody Cliente cliente,@RequestParam Integer idContabil){
        if(clienteService.findById(idContabil) != null){
            cliente.setContabil(new Contabil(idContabil));
            return clienteService.save(cliente);
        }else {
            return clienteService.save(cliente);
        }
    }

    @PutMapping
    ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        if(clienteService.findById(cliente.getId()).isPresent()){
            return new ResponseEntity(clienteService.save(cliente), HttpStatus.OK);
        }else{
            return new ResponseEntity(cliente, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        clienteService.deleteById(id);
    }
}
