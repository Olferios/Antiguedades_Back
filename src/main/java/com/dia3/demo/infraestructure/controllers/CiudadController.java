package com.dia3.demo.infraestructure.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.dia3.demo.application.services.CiudadService;
import com.dia3.demo.domain.entities.Ciudad;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/api/ciudad")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public List<Ciudad> getAllCiudades() {
        return ciudadService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> getCiudadById(@PathVariable Long id) {
        return ResponseEntity.of(ciudadService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Ciudad> createCiudad(@RequestBody Ciudad ciudad) {
        Ciudad newCiudad = ciudadService.save(ciudad);
        return new ResponseEntity<>(newCiudad, HttpStatus.CREATED);
    }
}
