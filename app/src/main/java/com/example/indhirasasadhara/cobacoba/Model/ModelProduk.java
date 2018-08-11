package com.example.indhirasasadhara.cobacoba.Model;

import android.widget.ImageView;

/**
 * Created by Indhira Sasadhara on 8/11/2018.
 */

public class ModelProduk {
    String imgProduk;
    String namaProduk;
    String hrgProduk;

    public ModelProduk() {
    }

    public ModelProduk(String imgProduk, String namaProduk, String hrgProduk) {
        this.imgProduk = imgProduk;
        this.namaProduk = namaProduk;
        this.hrgProduk = hrgProduk;
    }

    public String getImgProduk() {
        return imgProduk;
    }

    public void setImgProduk(String imgProduk) {
        this.imgProduk = imgProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHrgProduk() {
        return hrgProduk;
    }

    public void setHrgProduk(String hrgProduk) {
        this.hrgProduk = hrgProduk;
    }
}
