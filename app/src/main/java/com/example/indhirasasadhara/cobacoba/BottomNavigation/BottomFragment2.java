package com.example.indhirasasadhara.cobacoba.BottomNavigation;


import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.MainActivity;
import com.example.indhirasasadhara.cobacoba.NavigationDrawer.MasterFragment;
import com.example.indhirasasadhara.cobacoba.R;
import com.example.indhirasasadhara.cobacoba.SliderNavigation.ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("SetJavaScriptEnabled")
public class BottomFragment2 extends MasterFragment {
    @SuppressWarnings("unused")
    private MainActivity mContext;
    private ProgressDialog mProgressDialog;
    private TextView txtTitle;
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
        mContext = (MainActivity) getMasterActivity();
        View view = inflater.inflate(R.layout.fragment_bottom_fragment2, container, false);
        TabLayout mTabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.viewPager);
//        setSupportActionBar(mToolbar);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.add(getResources().getString(R.string.first));
        adapter.add(getResources().getString(R.string.second));
        adapter.add(getResources().getString(R.string.third));
        adapter.add(getResources().getString(R.string.third));
        adapter.add(getResources().getString(R.string.third));
        adapter.add(getResources().getString(R.string.third));
        adapter.add(getResources().getString(R.string.third));
        viewPager.setAdapter(adapter);

    }
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {
        getMasterActivity().setTitle("About App");
        getMasterActivity().showTitleBar();

        txtTitle = (TextView) v.findViewById(R.id.title);
//        txtTitle.setText("ABOUT PAGE");
    }

    public void showWaitIndicator(boolean state) {
        showWaitIndicator(state, "");
    }

    public void showWaitIndicator(boolean state, String message) {
        if (state) {
            mProgressDialog = new ProgressDialog(getMasterActivity(),
                    R.style.TransparentProgressDialog);
            mProgressDialog
                    .setProgressStyle(android.R.style.Widget_ProgressBar_Large);
            mProgressDialog.show();
        } else {
            mProgressDialog.dismiss();
        }
    }


}
