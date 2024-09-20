package com.dia3.demo.application.services;

import java.util.List;
import java.util.Optional;

import com.dia3.demo.domain.entities.Region;

public interface RegionService {
    Optional<Region> findById(Long id);

    List<Region> findAll();

    Region save(Region region);

    void deleteById(Long id);
    Region update(Region region);
    boolean existsById(Long id);

}
