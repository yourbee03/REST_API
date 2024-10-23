/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.msib.services;

import com.test.msib.exceptions.ResourceNotFoundException;
import com.test.msib.entities.LokasiEntity;
import com.test.msib.repositories.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * The LokasiService class provides methods for managing the Lokasi entity.
 * It uses the LokasiRepository interface to interact with the database.
 *
 * @author user
 */
@Service
public class LokasiService {

    /**
     * The LokasiRepository instance used for database operations.
     */
    @Autowired
    private LokasiRepository lokasiRepository;

    /**
     * Saves a new Lokasi entity to the database.
     *
     * @param lokasiEntity the Lokasi entity to be saved
     * @return the saved Lokasi entity
     */
    public LokasiEntity saveLokasi(LokasiEntity lokasiEntity) {
        return lokasiRepository.save(lokasiEntity);
    }

    /**
     * Retrieves all Lokasi entities from the database.
     *
     * @return a list of all Lokasi entities
     */
    public List<LokasiEntity> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    /**
     * Updates an existing Lokasi entity in the database.
     *
     * @param id the unique identifier of the Lokasi entity to be updated
     * @param lokasiEntityDetails the updated Lokasi entity details
     * @return the updated Lokasi entity
     */
    public LokasiEntity updateLokasi(Long id, LokasiEntity lokasiEntityDetails) {
        LokasiEntity lokasiEntity = lokasiRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Lokasi not found"));
        lokasiEntity.setNamaLokasi(lokasiEntityDetails.getNamaLokasi());
        lokasiEntity.setNegara(lokasiEntityDetails.getNegara());
        lokasiEntity.setProvinsi(lokasiEntityDetails.getProvinsi());
        lokasiEntity.setKota(lokasiEntityDetails.getKota());
        return lokasiRepository.save(lokasiEntity);
    }

    /**
     * Deletes a Lokasi entity from the database.
     *
     * @param id the unique identifier of the Lokasi entity to be deleted
     */
    public void deleteLokasi(Long id) {
        lokasiRepository.deleteById(id);
    }
}