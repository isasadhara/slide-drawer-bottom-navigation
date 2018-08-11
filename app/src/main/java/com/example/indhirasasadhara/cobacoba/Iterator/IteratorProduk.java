package com.example.indhirasasadhara.cobacoba.Iterator;

import com.example.indhirasasadhara.cobacoba.Model.ModelProduk;

import java.util.List;

/**
 * Created by Indhira Sasadhara on 8/11/2018.
 */

public interface IteratorProduk {
    interface view {
        void showLoading();

        void dismissLoading();

        void onFailure(String message);

        void onGetSuccess(List<ModelProduk> list);
    }
}
