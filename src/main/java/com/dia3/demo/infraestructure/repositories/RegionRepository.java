package com.dia3.demo.infraestructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dia3.demo.domain.entities.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {

}
