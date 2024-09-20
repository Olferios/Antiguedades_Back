package com.dia3.demo.infraestructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dia3.demo.application.services.PaisService;
import com.dia3.demo.domain.entities.Pais;
import com.dia3.demo.infraestructure.repositories.PaisRepository;

@Service
public class PaisAdapter implements PaisService{

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public Optional<Pais> findById(Long id) {
        return paisRepository.findById(id);
    }

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public void deleteById(Long id) {
        paisRepository.deleteById(id);
    }

    @Override
    public Pais update(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public boolean existsById(Long id) {
        return paisRepository.existsById(id);
    }

}
