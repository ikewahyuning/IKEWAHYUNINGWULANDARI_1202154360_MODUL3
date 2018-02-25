package com.example.android.ikewahyuningwulandari_1202154360_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;


import java.util.ArrayList;
import java.util.Collections;

public class AirActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private ArrayList<String> jenis;
    private ArrayList<String> keterangan;
    private ArrayList<Integer> produk;


    private String[] type = {"Ades","Amidis","Aqua","Cleo","Club","Equil","Evian","Leminerale","Nestle","Pristine","Vit"};

    private String[] desc = {"minuman merek Ades","minuman merek Amidis","minuman merek Aqua",
            "minuman merek Cleo","minuman merek Club","minuman merek Equil","minuman merek Evian",
            "minuman merek Leminerale","minuman merek Nestle","minuman merek Pristine","minuman merek Vit"};

    private int[] gambar = {R.drawable.ades,R.drawable.amidis,R.drawable.aqua,R.drawable.cleo,R.drawable.club,R.drawable.equil,R.drawable.evian,
            R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_air);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);


        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);


        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

        jenis = new ArrayList<>();
        keterangan = new ArrayList<>();
        produk = new ArrayList<>();


        adapter = new AdapterAir(jenis, keterangan, produk);

        recyclerView.setAdapter(adapter);
        for (int w=0; w<type.length; w++) {
            produk.add(gambar[w]);
            jenis.add(type[w]);
            keterangan.add(desc[w]);
        }

        int swipeDirs;
        if(gridColumnCount > 1){
            swipeDirs = 0;
        } else {
            swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        }
        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback
                (ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN
                        | ItemTouchHelper.UP, swipeDirs) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();


                Collections.swap(keterangan, from,to);
                Collections.swap(jenis,from,to);
                Collections.swap(produk,from,to);
                adapter.notifyItemMoved(from, to);
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                jenis.remove(viewHolder.getAdapterPosition());
                keterangan.remove(viewHolder.getAdapterPosition());
                produk.remove(viewHolder.getAdapterPosition());

                adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });
        helper.attachToRecyclerView(recyclerView);



    }

}
