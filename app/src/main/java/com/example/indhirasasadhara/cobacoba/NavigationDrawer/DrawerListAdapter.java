package com.example.indhirasasadhara.cobacoba.NavigationDrawer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.R;

import java.util.ArrayList;

/**
 * Created by Indhira Sasadhara on 8/8/2018.
 */

@SuppressLint({ "ViewHolder", "InflateParams" })
public class DrawerListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NavDrawerItem> navDrawerItems;

    public DrawerListAdapter(Context context,
                             ArrayList<NavDrawerItem> navDrawerItems) {
        this.context = context;
        this.navDrawerItems = navDrawerItems;
    }

    @Override
    public int getCount() {
        return navDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        convertView = mInflater.inflate(R.layout.drawer_list_item, null, true);

        TextView txtTitle = (TextView) convertView.findViewById(R.id.text);

        txtTitle.setText(navDrawerItems.get(position).getTitle());
        return convertView;
    }

}
