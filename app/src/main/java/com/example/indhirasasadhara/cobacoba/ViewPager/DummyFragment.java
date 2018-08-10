package com.example.indhirasasadhara.cobacoba.ViewPager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.R;

public class DummyFragment extends Fragment {
    public static final String COLOR = "color";
    public static final String TEXT = "text";

    public static Fragment newInstance(String text) {
        DummyFragment f = new DummyFragment();
        Bundle args = new Bundle();
        args.putString(TEXT, text);
        f.setArguments(args);
        return f;
    }
    public DummyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dummy, container, false);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frameLayout);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        frameLayout.setBackgroundColor(getArguments().getInt(COLOR));
        textView.setText(getArguments().getString(TEXT));
        return view;
    }



}
