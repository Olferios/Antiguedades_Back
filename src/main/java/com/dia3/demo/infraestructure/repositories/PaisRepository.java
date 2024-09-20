package com.dia3.demo.infraestructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dia3.demo.domain.entities.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    

}
