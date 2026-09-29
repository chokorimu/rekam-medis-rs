package com.sehatsentosa.app;

import com.sehatsentosa.pasien.Pasien;
import com.sehatsentosa.rawatinap.PasienVIP;

public class Main {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien(101, "Budi Santoso", "MED-KEY-123");
        PasienVIP pasienVip = new PasienVIP(102, "Siti Rahma", "Deluxe", "MED-KEY-456");
        Pasien pasienInvalid = new Pasien(103, "Joko Susilo", "INVALID-KEY");

        System.out.println("> Verifikasi Identitas Pasien (Read-Only ID):");
        System.out.println("Pasien 1 ID: " + pasien1.getId() + " - " + pasien1.getName());
        System.out.println("Pasien VIP ID: " + pasienVip.getId() + " - " + pasienVip.getName());
        System.out.println();

        System.out.println("> Prosedur Diagnosa & Validasi Berkas Internal:");
        pasien1.diagnose("Demam Berdarah");
        System.out.println("Riwayat Diagnosa Pasien 1: " + pasien1.getDisease());

        pasienInvalid.diagnose("Flu Ringan");
        System.out.println("Riwayat Diagnosa Pasien Invalid: " + pasienInvalid.getDisease());
        System.out.println();

        System.out.println("> Pembaruan Kata Sandi Portal Medis (Write-Only):");
        pasien1.setPassword("Secret");
        System.out.println();

        System.out.println("> Layanan Rawat Inap Pasien VIP (Diskon Khusus):");
        System.out.println("Kamar Awal: " + pasienVip.getRoom());
        System.out.println("Diskon Awal: " + (pasienVip.getDiscount() * 100) + "%");

        pasienVip.setRoom("Premium");
        System.out.println("Kamar Baru: " + pasienVip.getRoom());
        System.out.println("Diskon Baru: " + (pasienVip.getDiscount() * 100) + "%");
        System.out.println();

        System.out.println("> Cetak Ringkasan Medis (Layanan Kasir & Pendaftaran):");
        pasien1.stat();
        System.out.println();
        pasienVip.stat();
    }
}