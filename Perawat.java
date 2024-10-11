/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.perawat;

import com.parent.Pegawai;

/**
 *
 * @author ASUS
 */
public final class Perawat extends Pegawai {
    private String shift;

    public Perawat(String nama, int id, String shift) {
        super(nama, id);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    
  
    public void tampilkanInformasi() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Shift: " + getShift());
    }
}
