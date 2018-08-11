package com.example.indhirasasadhara.cobacoba.BottomNavigation;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indhirasasadhara.cobacoba.R;
import com.example.indhirasasadhara.cobacoba.ViewPager.ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TabLayout mTabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewPager);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.add(getResources().getString(R.string.telusuri));
        adapter.add(getResources().getString(R.string.favorite));
        adapter.add(getResources().getString(R.string.pantau));
        adapter.add(getResources().getString(R.string.favorite));
        adapter.add(getResources().getString(R.string.produk));
        adapter.add(getResources().getString(R.string.diskusi));
        adapter.add(getResources().getString(R.string.riwayat));
        viewPager.setAdapter(adapter);

    }



}
