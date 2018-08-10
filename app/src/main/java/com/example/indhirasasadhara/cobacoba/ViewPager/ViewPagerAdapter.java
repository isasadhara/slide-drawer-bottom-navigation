package com.example.indhirasasadhara.cobacoba.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Indhira Sasadhara on 8/9/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter  {
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mFragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }
    @Override
    public Fragment getItem(int position) {
        final Fragment result;
        switch (position) {
            case 0:
                result = new TabFragment();
                break;
            case 1:
                result = new SecondFragment();
                break;

            default:
                result = new TabFragment();
                break;
        }

        return result;
    }
    @Override
    public int getCount() {
        return 2;
    }
    public void add(String title) {
        Fragment fragment = DummyFragment.newInstance(title);
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}