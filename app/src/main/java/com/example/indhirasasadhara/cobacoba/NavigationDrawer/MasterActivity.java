package com.example.indhirasasadhara.cobacoba.NavigationDrawer;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.R;

/**
 * Created by Indhira Sasadhara on 8/8/2018.
 */

public class MasterActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void hideTitleBar() {
        RelativeLayout titleLayout = (RelativeLayout) findViewById(R.id.titlebar_layout);
        titleLayout.setVisibility(View.GONE);
    }

    public void showTitleBar() {
        RelativeLayout titleLayout = (RelativeLayout) findViewById(R.id.titlebar_layout);
        titleLayout.setVisibility(View.VISIBLE);
    }

    public void hideBackButton() {
        ImageButton backbutton = (ImageButton) findViewById(R.id.comman_back);
        backbutton.setVisibility(View.GONE);
    }

    public void showBackButton() {
        ImageButton backbutton = (ImageButton) findViewById(R.id.comman_back);
        backbutton.setVisibility(View.VISIBLE);
    }
}
