package com.dia3.demo.infraestructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dia3.demo.application.services.RegionService;
import com.dia3.demo.domain.entities.Region;
import com.dia3.demo.infraestructure.repositories.RegionRepository;

@Service
public class RegionAdapter implements RegionService {
    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Optional<Region> findById(Long id) {
        return  regionRepository.findById(id);
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
        
    }

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public void deleteById(Long id) {
        regionRepository.deleteById(id);
    }

    @Override
    public Region update(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public boolean existsById(Long id) {
        return regionRepository.existsById(id);
    }
    

}
