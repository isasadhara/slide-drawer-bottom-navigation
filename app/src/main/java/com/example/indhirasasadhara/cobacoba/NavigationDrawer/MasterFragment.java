package com.example.indhirasasadhara.cobacoba.NavigationDrawer;

import android.app.Dialog;
import android.support.v4.app.Fragment;

/**
 * Created by Indhira Sasadhara on 8/8/2018.
 */


public class MasterFragment extends Fragment {

    // returns the master activity
    public MasterActivity getMasterActivity() {
        MasterActivity masterActivity = (MasterActivity) getActivity();
        return masterActivity;
    }

    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        return null;
    }

}

