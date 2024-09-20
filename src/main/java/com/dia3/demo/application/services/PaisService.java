package com.dia3.demo.application.services;

import java.util.List;
import java.util.Optional;

import com.dia3.demo.domain.entities.Pais;

public interface PaisService {
    Optional<Pais> findById(Long id);

    List<Pais> findAll();

    Pais save(Pais pais);

    void deleteById(Long id);
    Pais update(Pais pais);
    boolean existsById(Long id);
    

    

}
