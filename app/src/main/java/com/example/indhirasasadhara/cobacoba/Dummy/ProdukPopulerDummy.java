package com.example.indhirasasadhara.cobacoba.Dummy;

import com.example.indhirasasadhara.cobacoba.Model.ModelProduk;
import com.example.indhirasasadhara.cobacoba.R;

import java.util.ArrayList;

/**
 * Created by Indhira Sasadhara on 8/11/2018.
 */

public class ProdukPopulerDummy {
    public static String[][] produk = new String[][]{
            {"Daging", "Rp.105.000/kg", String.valueOf(R.drawable.tomato)},
            {"Tomat Merah", "Rp.35.000/kg", String.valueOf(R.drawable.tomato)},
            {"Bayam", "Rp.35.000/kg", String.valueOf(R.drawable.tomato)},
            {"Bayam", "Rp.35.000/kg", String.valueOf(R.drawable.tomato)},
    };

    public static ArrayList<ModelProduk> getListData() {
        ModelProduk check = null;
        ArrayList<ModelProduk> list = new ArrayList<>();
        for (int i = 0; i < produk.length; i++) {
            check = new ModelProduk();
            check.setNamaProduk(produk[i][0]);
            check.setHrgProduk(produk[i][1]);
            check.setImgProduk(produk[i][2]);

            list.add(check);
        }
        return list;
    }
}
