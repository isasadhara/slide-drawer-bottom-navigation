package com.example.indhirasasadhara.cobacoba.BottomNavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indhirasasadhara.cobacoba.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment1 extends Fragment {
    public static BottomFragment1 newInstance() {
        BottomFragment1 fragment = new BottomFragment1();
        return fragment;
    }

    public BottomFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_fragment1, container, false);
    }

}
