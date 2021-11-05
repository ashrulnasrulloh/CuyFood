package com.example.cuyfood;

import android.graphics.drawable.Drawable;

public class CuyFood {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;

    CuyFood(String judul, String deskripsi, int harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}
