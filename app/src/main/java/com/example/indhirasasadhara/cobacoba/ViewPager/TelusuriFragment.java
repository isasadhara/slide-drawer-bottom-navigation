package com.example.indhirasasadhara.cobacoba.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.Adapter.ProdukPopulerAdapter;
import com.example.indhirasasadhara.cobacoba.Dummy.ProdukPopulerDummy;
import com.example.indhirasasadhara.cobacoba.Model.ModelProduk;
import com.example.indhirasasadhara.cobacoba.R;
import com.example.indhirasasadhara.cobacoba.ViewPager.GridView.GridItemActivity;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.FragmentSlider;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.SliderIndicator;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.SliderPagerAdapter;
import com.example.indhirasasadhara.cobacoba.ViewPager.SliderImage.SliderView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class TelusuriFragment extends Fragment {
    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;
    private SliderView sliderView;
    private LinearLayout mLinearLayout;

    GridView gridView;
    String[] fruitNames = {"Daging","Sayur","Buah","Buah","Sayur","Daging"};
    int[] fruitImages = {R.drawable.ic_meat,R.drawable.ic_vegetables,R.drawable.ic_fruit, R.drawable.ic_meat,R.drawable.ic_vegetables,R.drawable.ic_fruit};
    @BindView(R.id.rvProduk)
    RecyclerView rvProduk;
    ArrayList<ModelProduk> produkList;


    public TelusuriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_telusuri, container, false);

        ButterKnife.bind(this,view);

        //produk populer manggil data dummy
        produkList = new ArrayList<>();
        produkList.addAll(ProdukPopulerDummy.getListData());

        showRecycleList();

        //inisialisasi slider image
        sliderView = (SliderView) view.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) view.findViewById(R.id.pagesContainer);
        setupSlider();


        //Gridview
        //finding listview
        gridView = view.findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity().getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",fruitNames[i]);
                intent.putExtra("image",fruitImages[i]);
                startActivity(intent);

            }
        });
        return view;

    }

    //<<=======================================================================================================>>
    //SliderImage
    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-1.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-2.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-3.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-4.jpg"));

        mAdapter = new SliderPagerAdapter(getChildFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

    //<<================================================================================================================>>
    //GridView
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_grid,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;
        }
    }

    //<<==========================================================================================================>>
    //produk populer
    private void showRecycleList() {
        rvProduk.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        ProdukPopulerAdapter spAdapter = new ProdukPopulerAdapter(getActivity());
        spAdapter.setList(produkList);
        rvProduk.setAdapter(spAdapter);
    }





}
