/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo2;

import com.pegawai.*;
import com.karyawan.*;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    static ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
    static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int idCounter = 1;

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("========================================");
            System.out.println("\n             Menu:                    ");
            System.out.println("========================================");
            System.out.println(          "1. Tambah Dokter              ");
            System.out.println(          "2. Tambah Perawat             ");
            System.out.println(          "3. Tambah Pasien              ");
            System.out.println(          "4. Tampilkan Informasi Pegawai");
            System.out.println(          "5. Tampilkan Informasi Pasien ");
            System.out.println(          "6. Update data                ");
            System.out.println(          "7. Hapus data                 ");
            System.out.println(          "8. Keluar                     ");
            System.out.println("========================================");
            System.out.print( "Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Menangkap karakter newline setelah angka

            switch (pilihan) {
                case 1:
                    tambahDokter();
                    break;
                case 2:
                    tambahPerawat();
                    break;
                case 3:
                    tambahPasien();
                    break;
                case 4:
                    tampilkanInformasiPegawai();
                    break;
                case 5:
                    tampilkanInformasiPasien();
                    break;
                case 6:
                    updateData();
                    break;
                case 7:
                    hapusData();
                    break;
                case 8:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    static void tambahDokter() {
        System.out.print("Masukkan nama dokter: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan spesialisasi: ");
        String spesialisasi = scanner.nextLine();

        Dokter dokter = new Dokter(nama, idCounter++, spesialisasi);
        daftarPegawai.add(dokter);
        System.out.println("Dokter berhasil ditambahkan!");
    }

    static void tambahPerawat() {
        System.out.print("Masukkan nama perawat: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan shift: ");
        String shift = scanner.nextLine();

        Perawat perawat = new Perawat(nama, idCounter++, shift);
        daftarPegawai.add(perawat);
        System.out.println("Perawat berhasil ditambahkan!");
    }

    static void tambahPasien() {
        System.out.print("Masukkan nama pasien: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan keluhan: ");
        String diagnosis = scanner.nextLine();

        Pasien pasien = new Pasien(nama, idCounter++, diagnosis);
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan!");
    }

    static boolean tampilkanInformasiPegawai() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("Belum ada pegawai terdaftar.");
            return false;
        }

        for (Pegawai pegawai : daftarPegawai) {
            pegawai.tampilkanInformasi();
            System.out.println("---------------------");
        }return true;
    }

    static boolean tampilkanInformasiPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien terdaftar.");
            return false ;
        }

        for (Pasien pasien : daftarPasien) {
            pasien.tampilkanInformasi();
            System.out.println("---------------------");
        }return true;
    }

    static void hapusData(){
        System.out.println("Pilih jenis data yang akan dihapus:");
        System.out.println("========================================");
        System.out.println("            1. Hapus Dokter             ");
        System.out.println("            2. Hapus Perawat            ");
        System.out.println("            3. Hapus Pasien             ");
        System.out.println("            4. Kembali                  ");
        System.out.println("========================================");
        System.out.print("Pilihan Anda: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Menangkap karakter newline setelah angka

        switch (pilihan) {
            case 1:
                if (tampilkanInformasiPegawai()) {
                    System.out.print("Masukkan ID dokter yang akan dihapus: ");
                    int idDokter = scanner.nextInt();

                    for (Pegawai pegawai : daftarPegawai) {
                        if (pegawai instanceof Dokter && pegawai.getId() == idDokter) {
                            daftarPegawai.remove(pegawai);
                            System.out.println("Dokter "+pegawai.getNama()+" berhasil dihapus.");
                            return;
                        }
                    }

                    System.out.println("Dokter dengan ID tersebut tidak ditemukan.");
                }
                break;
            case 2:
                if (tampilkanInformasiPegawai()){
                    System.out.print("Masukkan ID perawat yang akan dihapus: ");
                    int idPerawat = scanner.nextInt();

                    for (Pegawai pegawai : daftarPegawai) {
                        if (pegawai instanceof Perawat && pegawai.getId() == idPerawat) {
                            daftarPegawai.remove(pegawai);
                            System.out.println("Perawat "+pegawai.getNama()+" berhasil dihapus.");
                            return;
                        }
                    }

                    System.out.println("Perawat dengan ID tersebut tidak ditemukan.");
                }
                break;
            case 3:
                if (tampilkanInformasiPasien()){
                    System.out.print("Masukkan ID pasien yang akan dihapus: ");
                    int idPasien = scanner.nextInt();

                    for (Pasien pasien : daftarPasien) {
                        if (pasien.getId() == idPasien) {
                            daftarPasien.remove(pasien);
                            System.out.println("Pasien "+pasien.getNama()+" berhasil dihapus.");
                            return;
                        }
                    }

                    System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
                }
                break;
            case 4:
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    static void updateData(){
        System.out.println("========================================");
        System.out.println("\n           Menu Update Data:          ");
        System.out.println("========================================");
        System.out.println("          1. Update Data Dokter         ");
        System.out.println("          2. Update Data Perawat        ");
        System.out.println("          3. Update Data Pasien         ");
        System.out.println("          4. Kembali                    ");
        System.out.println("========================================");
        System.out.print("Pilihan Anda: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Menangkap karakter newline

        switch (pilihan) {
            case 1:
                if (tampilkanInformasiPegawai()){
                    System.out.print("Masukkan ID dokter yang akan diubah: ");
                    int idDokter = scanner.nextInt();
                    scanner.nextLine();  // Menangkap karakter newline

                    for (Pegawai pegawai : daftarPegawai) {
                        if (pegawai instanceof Dokter && pegawai.getId() == idDokter) {
                            System.out.print("Masukkan nama dokter baru: ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan spesialisasi baru: ");
                            String spesialisasi = scanner.nextLine();

                            ((Dokter) pegawai).setNama(nama);
                            ((Dokter) pegawai).setSpesialisasi(spesialisasi);

                            System.out.println("Data dokter berhasil diubah.");
                            return;
                        }
                    }

                    System.out.println("Dokter dengan ID tersebut tidak ditemukan.");
                }
                break;
            case 2:
                if (tampilkanInformasiPegawai()){
                    System.out.print("Masukkan ID perawat yang akan diubah: ");
                    int idPerawat = scanner.nextInt();
                    scanner.nextLine();  // Menangkap karakter newline

                    for (Pegawai pegawai : daftarPegawai) {
                        if (pegawai instanceof Perawat && pegawai.getId() == idPerawat) {
                            System.out.print("Masukkan nama perawat baru: ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan shift baru: ");
                            String shift = scanner.nextLine();

                            ((Perawat) pegawai).setNama(nama);
                            ((Perawat) pegawai).setShift(shift);

                            System.out.println("Data perawat berhasil diubah.");
                            return;
                        }
                    }
                    System.out.println("Perawat dengan ID tersebut tidak ditemukan."); 
                }
                break;
            case 3:
                if (tampilkanInformasiPasien()){
                    System.out.print("Masukkan ID pasien yang akan diubah: ");
                    int idPasien = scanner.nextInt();
                    scanner.nextLine();  // Menangkap karakter newline

                    for (Pasien pasien : daftarPasien) {
                        if (pasien.getId() == idPasien) {
                            System.out.print("Masukkan nama pasien baru: ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan keluhan baru: ");
                            String keluhan = scanner.nextLine();

                            pasien.setNama(nama);
                            pasien.setKeluhan(keluhan);

                            System.out.println("Data pasien berhasil diubah.");
                            return;
                        }
                    }
                    System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
                }
                break;
                
            case 4:
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
}
