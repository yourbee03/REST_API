package com.test.msib.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

/**
 * The Lokasi class represents a location entity in the application.
 * It is mapped to the "lokasi" table in the database.
 *
 * @author user
 */
@Entity
@Table(name = "lokasi")
public class LokasiEntity {

    /**
     * The unique identifier for the location.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the location.
     */
    @Column(name = "nama_lokasi")
    private String namaLokasi;

    /**
     * The country of the location.
     */
    private String negara;

    /**
     * The province of the location.
     */
    private String provinsi;

    /**
     * The city of the location.
     */
    private String kota;

    /**
     * The timestamp when the location was created.
     */
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    /**
     * Retrieves the unique identifier for the location.
     *
     * @return the unique identifier for the location
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the location.
     *
     * @param id the unique identifier for the location
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the location.
     *
     * @return the name of the location
     */
    public String getNamaLokasi() {
        return namaLokasi;
    }

    /**
     * Sets the name of the location.
     *
     * @param namaLokasi the name of the location
     */
    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    /**
     * Retrieves the country of the location.
     *
     * @return the country of the location
     */
    public String getNegara() {
        return negara;
    }

    /**
     * Sets the country of the location.
     *
     * @param negara the country of the location
     */
    public void setNegara(String negara) {
        this.negara = negara;
    }

    /**
     * Retrieves the province of the location.
     *
     * @return the province of the location
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * Sets the province of the location.
     *
     * @param provinsi the province of the location
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * Retrieves the city of the location.
     *
     * @return the city of the location
     */
    public String getKota() {
        return kota;
    }

    /**
     * Sets the city of the location.
     *
     * @param kota the city of the location
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * Retrieves the timestamp when the location was created.
     *
     * @return the timestamp when the location was created
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the timestamp when the location was created.
     *
     * @param createdAt the timestamp when the location was created
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}