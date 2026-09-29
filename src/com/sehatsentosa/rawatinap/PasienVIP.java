package com.sehatsentosa.rawatinap;
    
import com.sehatsentosa.pasien.Pasien;

public class PasienVIP extends Pasien {
    private String room;

    public PasienVIP(int id, String name, String room, String key) {
        super(id, name, key);
        setRoom(room);
    }

    public void setRoom(String room) {
        this.room = room;
        switch (room) {
            case "Premium":
                this.discount = 0.15;
                break;
            case "Deluxe":
                this.discount = 0.30;
                break;
            default:
                this.discount = 0.0;
                break;
        }
    }

    public String getRoom() {
        return this.room;
    }
}