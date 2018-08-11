package com.example.indhirasasadhara.cobacoba.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.DiskusiFragment;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.FavoriteFragment;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.PantauHargaFragment;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.ProdukFragment;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.RiwayatHargaFragment;

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
                result = new TelusuriFragment();
                break;
            case 1:
                result = new KategoriFragment();
                break;
            case 2:
                result = new PantauHargaFragment();
                break;
            case 3:
                result = new FavoriteFragment();
                break;
            case 4:
                result = new ProdukFragment();
                break;
            case 5:
                result = new DiskusiFragment();
                break;
            case 6:
                result = new RiwayatHargaFragment();
                break;

            default:
                result = new TelusuriFragment();
                break;
        }

        return result;
    }
    @Override
    public int getCount() {
        return 7;
    }

    public void add(String title) {
        Fragment fragment = DummyTabFragment.newInstance(title);
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}