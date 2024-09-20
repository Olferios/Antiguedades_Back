package com.dia3.demo.infraestructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dia3.demo.application.services.PaisService;
import com.dia3.demo.domain.entities.Pais;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/pais")
public class PaisController {
    @Autowired
    private PaisService paisService;

    @GetMapping
    public List<Pais> getAllPais(){
        return paisService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pais> getPaisById(@PathVariable Long id){
        return ResponseEntity.of(paisService.findById(id));
        
    }

    @PostMapping("/create")
    public ResponseEntity<Pais> createpais(@RequestBody Pais pais){
        Pais newPais=paisService.save(pais);
        return new ResponseEntity<>(newPais,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePais (@PathVariable Long id){
        if(!paisService.existsById(id)){
            return ResponseEntity.notFound().build();
        }paisService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Pais> updatePais(@PathVariable Long id, @RequestBody Pais pais){
        if(!paisService.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        pais.setId(id);
        Pais savedPais=paisService.save(pais);
        return ResponseEntity.ok(savedPais);
    }
    

    
    

}
