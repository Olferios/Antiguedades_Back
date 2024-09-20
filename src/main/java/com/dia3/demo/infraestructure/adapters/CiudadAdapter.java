package com.dia3.demo.infraestructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dia3.demo.application.services.CiudadService;
import com.dia3.demo.domain.entities.Ciudad;
import com.dia3.demo.infraestructure.repositories.CiudadRepository;

@Service
public class CiudadAdapter implements CiudadService{
    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public Optional<Ciudad> findById(Long id) {
        return ciudadRepository.findById(id);
    }

    @Override
    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad save(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public void deleteById(Long id) {
        ciudadRepository.deleteById(id);
    }

    @Override
    public Ciudad update(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public boolean existsById(Long id) {
        return ciudadRepository.existsById(id);
    }

}
