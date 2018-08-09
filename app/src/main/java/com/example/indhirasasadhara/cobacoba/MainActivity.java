package com.example.indhirasasadhara.cobacoba;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.BottomNavigation.BottomFragment1;
import com.example.indhirasasadhara.cobacoba.BottomNavigation.BottomFragment2;
import com.example.indhirasasadhara.cobacoba.BottomNavigation.BottomFragment3;
import com.example.indhirasasadhara.cobacoba.BottomNavigation.BottomNavigationViewHelper;
import com.example.indhirasasadhara.cobacoba.NavigationDrawer.DrawerListAdapter;
import com.example.indhirasasadhara.cobacoba.NavigationDrawer.MasterActivity;
import com.example.indhirasasadhara.cobacoba.NavigationDrawer.NavDrawerItem;
import com.example.indhirasasadhara.cobacoba.SliderNavigation.SliderFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
@SuppressWarnings("ResourceType")
@SuppressLint({"NewApi", "RtlHardcoded"})
public class MainActivity extends MasterActivity {

    private ListView mDrawerList;
    private ImageButton menu;
    public ImageButton back;
    private String[] navMenuTitles;
    private TypedArray navMenuIcons;
    private DrawerListAdapter adapter;
    private View mHeader;

    private ArrayList<NavDrawerItem> navDrawerItems;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new BottomFragment2().newInstance();
//                        Toast.makeText(getApplicationContext(), "Button is clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_favorites:
                        selectedFragment = new BottomFragment3().newInstance();
                        break;
                    case R.id.nav_search:
                        selectedFragment = new BottomFragment1().newInstance();
                        break;
                    case R.id.nav_bottom:
                        selectedFragment = new BottomFragment1().newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, selectedFragment);
                transaction.commit();
                return true;
            }
        });

        //Setting Layout to be display
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, BottomFragment2.newInstance());
        transaction.commit();


        back = (ImageButton) findViewById(R.id.comman_back);
        menu = (ImageButton) findViewById(R.id.comman_menu);

        mDrawerList = (ListView) findViewById(R.id.drawer_list);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerShadow(R.mipmap.ic_launcher,
                GravityCompat.START);
        mDrawerList.setItemChecked(0, true);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toggleMenu(v);
                if (mDrawerLayout.isDrawerVisible(Gravity.LEFT)) {
                    return;
                } else {
                    mDrawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.onBackPressed();
            }
        });

        // Custom Header ...
        mHeader = getLayoutInflater().inflate(R.layout.navigation_list_header,
                mDrawerList, false);
        TextView txtProfileName = (TextView) mHeader
                .findViewById(R.id.txtProfileName);
        ImageView imgProfileImage = (ImageView) mHeader
                .findViewById(R.id.imgProfileImage);

        txtProfileName.setText("Indhira Sasadhara");

        Picasso.with(MainActivity.this).load(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher).resize(200, 200)
                .centerCrop().into(imgProfileImage);

        mDrawerList.addHeaderView(mHeader);
        // Custom Header End...

        navMenuTitles = getResources().getStringArray(R.array.nav_drawer_title);

        navMenuIcons = getResources()
                .obtainTypedArray(R.array.nav_drawer_icons);

        navDrawerItems = new ArrayList<NavDrawerItem>();

        navDrawerItems.add(new NavDrawerItem(navMenuTitles[0], navMenuIcons
                .getResourceId(0, -1)));
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[1], navMenuIcons
                .getResourceId(1, -1)));
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[2], navMenuIcons
                .getResourceId(2, -1)));
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[3], navMenuIcons
                .getResourceId(3, -1)));
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[4], navMenuIcons
                .getResourceId(4, -1)));

        navMenuIcons.recycle();

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                changeFragment(position);
                mDrawerLayout.closeDrawers();
            }
        });

        adapter = new DrawerListAdapter(MainActivity.this, navDrawerItems);
        mDrawerList.setAdapter(adapter);

//        if (savedInstanceState == null) {
//            Fragment landingFragment = new HomeFragment();
//            ReplaceFragement(landingFragment);
//        }
    }

    private void changeFragment(int index) {
        switch (index) {

            // MAIN ...
            case 1:
                Fragment blankFragment = new BottomFragment2();
                ReplaceFragement(blankFragment);
                break;
            case 2:
                Fragment faqFragment = new BottomFragment1();
                ReplaceFragement(faqFragment);
                break;
            case 3:
                Fragment customerserviceFragment = new BottomFragment3();
                ReplaceFragement(customerserviceFragment);
                break;
            case 4:
                Fragment aboutFragment = new BottomFragment3();
                ReplaceFragement(aboutFragment);
                break;

            default:
                break;
        }
    }

    public void ReplaceFragement(Fragment loginFragment) {
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.fragment_container, loginFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(Gravity.START)) {
            mDrawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}