/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib.services;

import com.test.msib.exceptions.ResourceNotFoundException;
import com.test.msib.entities.ProyekEntity;
import com.test.msib.repositories.ProyekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * The ProyekService class provides methods for managing the Proyek entity.
 * It uses the ProyekRepository interface to interact with the database.
 *
 * @author user
 */
@Service
public class ProyekService {

    /**
     * The ProyekRepository instance used for database operations.
     */
    @Autowired
    private ProyekRepository proyekRepository;

    /**
     * Saves a new Proyek entity to the database.
     *
     * @param proyekEntity the Proyek entity to be saved
     * @return the saved Proyek entity
     */
    public ProyekEntity saveProyek(ProyekEntity proyekEntity) {
        return proyekRepository.save(proyekEntity);
    }

    /**
     * Retrieves all Proyek entities from the database.
     *
     * @return a list of all Proyek entities
     */
    public List<ProyekEntity> getAllProyek() {
        return proyekRepository.findAll();
    }

    /**
     * Updates an existing Proyek entity in the database.
     *
     * @param id the unique identifier of the Proyek entity to be updated
     * @param proyekEntityDetails the updated Proyek entity details
     * @return the updated Proyek entity
     */
    public ProyekEntity updateProyek(Long id, ProyekEntity proyekEntityDetails) {
        ProyekEntity proyekEntity = proyekRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Proyek not found"));
        proyekEntity.setNamaProyek(proyekEntityDetails.getNamaProyek());
        proyekEntity.setClient(proyekEntityDetails.getClient());
        proyekEntity.setTglMulai(proyekEntityDetails.getTglMulai());
        proyekEntity.setTglSelesai(proyekEntityDetails.getTglSelesai());
        proyekEntity.setPimpinanProyek(proyekEntityDetails.getPimpinanProyek());
        proyekEntity.setKeterangan(proyekEntityDetails.getKeterangan());
        proyekEntity.setLokasi(proyekEntityDetails.getLokasi());
        return proyekRepository.save(proyekEntity);
    }

    /**
     * Deletes a Proyek entity from the database.
     *
     * @param id the unique identifier of the Proyek entity to be deleted
     */
    public void deleteProyek(Long id) {
        proyekRepository.deleteById(id);
    }
}