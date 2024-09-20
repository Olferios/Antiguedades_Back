package com.dia3.demo.infraestructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dia3.demo.application.services.RegionService;
import com.dia3.demo.domain.entities.Region;

@RestController
@RequestMapping("/api/region")

public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<Region> getAllRegion() {
        return regionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Region> getRegionById(@PathVariable Long id) {
        return ResponseEntity.of(regionService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Region> createRegion(@RequestBody Region region) {
        Region newRegion = regionService.save(region);
        return new ResponseEntity<>(newRegion, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRegion(@PathVariable Long id) {
        if (!regionService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        regionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Region> updateRegion(@PathVariable Long id, @RequestBody Region region) {
        if (!regionService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        region.setId(id);
        Region savedRegion = regionService.save(region);
        return ResponseEntity.ok(savedRegion);
    }



}
