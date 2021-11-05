package com.example.cuyfood;

import android.content.Context;

import java.util.ArrayList;

public class CuyFoodData {
    public static ArrayList<CuyFood> getData(Context context) {
        ArrayList<CuyFood> list = new ArrayList<CuyFood>();
        list.add(new CuyFood("Mie Goreng", "Mie Rebus tapi Goreng", 5000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new CuyFood("Nasi Goreng", "Nasi Putih di Goreng", 10000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new CuyFood("Kopi Hitam", "Kopi Alami langsung dari Alam", 12000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new CuyFood("Sparkling Tea", "Teh iya teh", 10000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
