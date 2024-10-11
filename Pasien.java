/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pasien;

/**
 *
 * @author ASUS
 */
public final class Pasien {
    private String nama,Keluhan;
    private int id;

    public Pasien(String nama, int id, String Keluhan) {
        this.nama = nama;
        this.id = id;
        this.Keluhan = Keluhan;
    }

    final public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }
    
    

    public void tampilkanInformasi() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Keluhan: " + getKeluhan());
    }
}
