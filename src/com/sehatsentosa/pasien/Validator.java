package com.sehatsentosa.pasien;

public class Validator {
    public static boolean validate(Pasien pasien) {
        return pasien.key != null && pasien.key.startsWith("MED-");
    }
}