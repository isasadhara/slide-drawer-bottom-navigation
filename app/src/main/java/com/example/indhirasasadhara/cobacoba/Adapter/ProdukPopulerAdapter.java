package com.example.indhirasasadhara.cobacoba.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.indhirasasadhara.cobacoba.Model.ModelProduk;
import com.example.indhirasasadhara.cobacoba.Presenter.PresenterProduk;
import com.example.indhirasasadhara.cobacoba.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Indhira Sasadhara on 8/11/2018.
 */

public class ProdukPopulerAdapter extends RecyclerView.Adapter<ProdukPopulerAdapter.ProdukViewHolder> {
    Context context;
    ArrayList<ModelProduk> list;
    private AdapterCallback mAdapterCallback;
    PresenterProduk presenterHistory;

    public ProdukPopulerAdapter(FragmentActivity activity) {
    }

    public ProdukPopulerAdapter(Context context, ArrayList<ModelProduk> list, AdapterCallback mAdapterCallback, PresenterProduk presenterHistory) {
        this.context = context;
        this.list = list;
        this.mAdapterCallback = mAdapterCallback;
        this.presenterHistory = presenterHistory;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<ModelProduk> getList() {
        return list;
    }

    public void setList(ArrayList<ModelProduk> list) {
        this.list = list;
    }

    public AdapterCallback getmAdapterCallback() {
        return mAdapterCallback;
    }

    public void setmAdapterCallback(AdapterCallback mAdapterCallback) {
        this.mAdapterCallback = mAdapterCallback;
    }

    public PresenterProduk getPresenterHistory() {
        return presenterHistory;
    }

    public void setPresenterHistory(PresenterProduk presenterHistory) {
        this.presenterHistory = presenterHistory;
    }

    public interface AdapterCallback {
        void onClickCard(List<ModelProduk> list, int position);
    }



    @NonNull
    @Override
    public ProdukPopulerAdapter.ProdukViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_produk, parent, false);
        ProdukViewHolder vh = new ProdukViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukPopulerAdapter.ProdukViewHolder holder, int position) {
        ModelProduk model = list.get(position);
        holder.namaProduk.setText(model.getNamaProduk());
        holder.hrgProduk.setText(model.getHrgProduk());
        holder.imgProduk.setImageResource(Integer.parseInt(model.getImgProduk()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface AdapterOnclick {
        void onClickItem(List<ModelProduk> list, int position);
    }

    public class ProdukViewHolder extends RecyclerView.ViewHolder {
        TextView namaProduk, hrgProduk;
        ImageView imgProduk;

        public ProdukViewHolder(View itemView) {
            super(itemView);
            namaProduk = (TextView) itemView.findViewById(R.id.namaProduk);
            hrgProduk = (TextView) itemView.findViewById(R.id.hrgProduk);
            imgProduk = (ImageView) itemView.findViewById(R.id.imgProduk);
        }
    }

}
