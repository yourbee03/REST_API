package com.test.msib.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * The Proyek class represents a project entity in the application.
 * It is mapped to the "proyek" table in the database.
 *
 * @author user
 */
@Entity
@Table(name = "proyek")
public class ProyekEntity {

    /**
     * The unique identifier for the project.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the project.
     */
    @Column(name = "nama_proyek")
    private String namaProyek;

    /**
     * The client of the project.
     */
    private String client;

    /**
     * The start date of the project.
     */
    @Column(name = "tgl_mulai")
    private LocalDateTime tglMulai;

    /**
     * The end date of the project.
     */
    @Column(name = "tgl_selesai")
    private LocalDateTime tglSelesai;

    /**
     * The project manager of the project.
     */
    @Column(name = "pimpinan_proyek")
    private String pimpinanProyek;

    /**
     * The description of the project.
     */
    private String keterangan;

    /**
     * The timestamp when the project was created.
     */
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    /**
     * The list of locations associated with the project.
     */
    @ManyToMany
    @JoinTable(
        name = "proyek_lokasi",
        joinColumns = @JoinColumn(name = "proyek_id"),
        inverseJoinColumns = @JoinColumn(name = "lokasi_id")
    )
    private List<LokasiEntity> lokasiEntity;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(LocalDateTime tglMulai) {
        this.tglMulai = tglMulai;
    }

    public LocalDateTime getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(LocalDateTime tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public String getPimpinanProyek() {
        return pimpinanProyek;
    }

    public void setPimpinanProyek(String pimpinanProyek) {
        this.pimpinanProyek = pimpinanProyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public List<LokasiEntity> getLokasi() {
        return lokasiEntity;
    }

    public void setLokasi(List<LokasiEntity> lokasiEntity) {
        this.lokasiEntity = lokasiEntity;
    }
}