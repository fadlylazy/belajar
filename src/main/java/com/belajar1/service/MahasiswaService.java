package com.belajar1.service;

import com.belajar1.model.Mahasiswa;

import java.util.List;

/**
 * Created by andi on 11/2/2016.
 */
public interface MahasiswaService {
    List<Mahasiswa> listMahasiswa();
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void hapus (Integer id);

}
