/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dokter;

import com.parent.Pegawai;

/**
 *
 * @author ASUS
 */
public final class Dokter extends Pegawai {
    private String spesialisasi;

    public Dokter(String nama, int id, String spesialisasi) {
        super(nama, id);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
    
    

    public void tampilkanInformasi() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Spesialisasi: " + getSpesialisasi());
    }
}
