/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib.controllers;

import com.test.msib.entities.ProyekEntity;
import com.test.msib.services.ProyekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * The ProyekController class provides REST API endpoints for managing projects.
 *
 * @author user
 */
@RestController
@RequestMapping("/proyek")
public class ProyekController {

    /**
     * The ProyekService instance used for project management operations.
     */
    @Autowired
    private ProyekService proyekService;

    /**
     * Creates a new project.
     *
     * @param proyekEntity the project details to be created
     * @return the created project
     */
    @PostMapping
    public ResponseEntity<ProyekEntity> createProyek(@RequestBody ProyekEntity proyekEntity) {
        ProyekEntity savedProyekEntity = proyekService.saveProyek(proyekEntity);
        return new ResponseEntity<>(savedProyekEntity, HttpStatus.CREATED);
    }

    /**
     * Retrieves all projects.
     *
     * @return a list of all projects
     */
    @GetMapping
    public ResponseEntity<List<ProyekEntity>> getAllProyek() {
        return ResponseEntity.ok(proyekService.getAllProyek());
    }

    /**
     * Updates an existing project.
     *
     * @param id the unique identifier of the project to be updated
     * @param proyekEntityDetails the updated project details
     * @return the updated project
     */
    @PutMapping("/{id}")
    public ResponseEntity<ProyekEntity> updateProyek(@PathVariable Long id, @RequestBody ProyekEntity proyekEntityDetails) {
        ProyekEntity updatedProyekEntity = proyekService.updateProyek(id, proyekEntityDetails);
        return ResponseEntity.ok(updatedProyekEntity);
    }

    /**
     * Deletes a project.
     *
     * @param id the unique identifier of the project to be deleted
     * @return a response indicating the successful deletion
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProyek(@PathVariable Long id) {
        proyekService.deleteProyek(id);
        return ResponseEntity.noContent().build();
    }
}