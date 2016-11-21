package com.belajar1.model;
import javax.persistence.*;




/**
 * Created by andi on 11/1/2016.
 */

@Entity

public class Mahasiswa {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private String nama;
    private String jurusan;
    private String Stambuk;

    @Version
    @Column (name="optVersion",columnDefinition = "integer DEFAULT 0")
    private Integer version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getStambuk() {
        return Stambuk;
    }

    public void setStambuk(String stambuk) {
        this.Stambuk = stambuk;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
