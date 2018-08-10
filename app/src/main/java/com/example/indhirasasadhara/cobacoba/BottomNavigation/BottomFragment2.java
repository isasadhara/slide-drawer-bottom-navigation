package com.example.indhirasasadhara.cobacoba.BottomNavigation;


import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.MainActivity;
import com.example.indhirasasadhara.cobacoba.NavigationDrawer.MasterFragment;
import com.example.indhirasasadhara.cobacoba.R;
import com.example.indhirasasadhara.cobacoba.ViewPager.ViewPagerAdapter;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment2 extends Fragment {

    public static BottomFragment2 newInstance() {
        BottomFragment2 fragment = new BottomFragment2();
        return fragment;
    }


    public BottomFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_fragment2, container, false);
        TabLayout mTabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewPager);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.add(getResources().getString(R.string.first));
        adapter.add(getResources().getString(R.string.second));
        viewPager.setAdapter(adapter);

    }




}
