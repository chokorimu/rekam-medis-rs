package com.sehatsentosa.pasien;

public class Pasien {
    private final int id;
    private String name;
    private String disease;
    private String password;
    protected double discount;
    String key;

    public Pasien(int id, String name, String key) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.discount = 0.0;
    }

    // getter
    public int getId() {
        return this.id;
    }    
    
    public String getName() {
        return this.name;
    }    

    public double getDiscount() {
        return this.discount; // hmm
    }    

    public String getDisease() {
        if (Validator.validate(this)) {
            return this.disease;
        }
        return "Access denied";
    }

    // setter
    public void setPassword(String newPassword) {
        if (newPassword == null) {
            System.out.println("Kata sandi tidak boleh kosong");
            return;
        }

        this.password = newPassword;
        System.out.println("Kata sandi berhasil diperbarui");
    }

    public void diagnose(String disease) {
            if (Validator.validate(this)) {
                this.disease = disease;
                System.out.println("Diagnosa berhasil diperbarui");
            } else {
                System.out.println("Berkas tidak valid");
            }
        }

    public void stat() {
        System.out.println("> Stat");
        System.out.println("Id: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Diskon: " + (this.getDiscount() * 100) + "%");
    }

}