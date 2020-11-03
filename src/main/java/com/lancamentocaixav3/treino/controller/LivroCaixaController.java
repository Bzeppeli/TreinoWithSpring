package com.lancamentocaixav3.treino.controller;

import com.lancamentocaixav3.treino.model.LivroCaixa;
import com.lancamentocaixav3.treino.service.LivroCaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LivroCaixaController {

    @Autowired
    LivroCaixaService livroCaixaService;

    @GetMapping("/caixa")
    Iterable<LivroCaixa> read() {
        return livroCaixaService.findAll();
    };

    @PostMapping("/caixa")
    LivroCaixa create(@RequestBody LivroCaixa livroCaixa){
        return livroCaixaService.save(livroCaixa);
    }

    @PutMapping("/caixa")
    ResponseEntity<LivroCaixa> update(@RequestBody LivroCaixa livroCaixa){
        if(livroCaixaService.findById(livroCaixa.getId()).isPresent()){
            return new ResponseEntity(livroCaixaService.save(livroCaixa), HttpStatus.OK);
        }else{
            return new ResponseEntity(livroCaixa, HttpStatus.BAD_REQUEST);
        }
    }

}


