package com.lancamentocaixav3.treino.controller;

import com.lancamentocaixav3.treino.model.Cliente;
import com.lancamentocaixav3.treino.model.Contabil;
import com.lancamentocaixav3.treino.service.ContabilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contabil")
public class ContabilController {

    @Autowired
    ContabilService contabilService;

    @GetMapping
    Iterable<Contabil> read(){
        return contabilService.findAll();
    }

    @PostMapping
    Contabil create(@RequestBody Contabil contabil){
        return contabilService.save(contabil);
    }

    @PutMapping
    ResponseEntity<Cliente> update(@RequestBody Contabil contabil){
        if(contabilService.findById(contabil.getId()).isPresent()){
            return new ResponseEntity(contabilService.save(contabil), HttpStatus.OK);
        }else{
            return new ResponseEntity(contabil, HttpStatus.BAD_REQUEST);
        }
    }

}
