package com.example.indhirasasadhara.cobacoba.SliderNavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.indhirasasadhara.cobacoba.BottomNavigation.BottomFragment2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Indhira Sasadhara on 8/9/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mFragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        final Fragment result;
        switch (position) {
            case 0:
                // First Fragment of First Tab
                result = new SliderFragment();
                break;
            case 1:
                // First Fragment of Second Tab
                result = new SliderFragment();
                break;
            case 2:
                // First Fragment of Third Tab
                result = new SliderFragment();
                break;
            case 3:
                // First Fragment of Third Tab
                result = new SliderFragment();
                break;
            case 4:
                // First Fragment of Third Tab
                result = new SliderFragment();
                break;
            case 5:
                // First Fragment of Third Tab
                result = new SliderFragment();
                break;
            case 6:
                // First Fragment of Third Tab
                result = new SliderFragment();
                break;

            default:
                result = null;
                break;
        }

        return result;
//        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 7;
    }

    public void add(String title) {
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}

