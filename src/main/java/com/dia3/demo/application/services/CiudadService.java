package com.dia3.demo.application.services;

import java.util.List;
import java.util.Optional;

import com.dia3.demo.domain.entities.Ciudad;

public interface CiudadService {
    Optional<Ciudad> findById(Long id);

    List<Ciudad> findAll();

    Ciudad save(Ciudad ciudad);

    void deleteById(Long id);
    Ciudad update(Ciudad ciudad);
    boolean existsById(Long id);

}
