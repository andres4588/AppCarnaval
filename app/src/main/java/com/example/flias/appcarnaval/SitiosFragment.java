package com.example.flias.appcarnaval;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class SitiosFragment extends Fragment {
    private FragmentActivity myContext;
    private RecyclerView listado;



    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sitios, container, false);


        listado = (RecyclerView)view.findViewById(R.id.rc_equipos);
        List<Equipo> equipos = new ArrayList<Equipo>();


        equipos.add(new Equipo(getResources().getString(R.string.Santuario),getResources().getString(R.string.DesSan),R.drawable.lajas2,R.drawable.santuario,"#FFFF00","#000000"));
        equipos.add(new Equipo(getResources().getString(R.string.SantuarioCo),getResources().getString(R.string.DesCo),R.drawable.islacorota,R.drawable.corota,"#2196F3","#FFFFFF"));
        equipos.add(new Equipo(getResources().getString(R.string.Laguna),getResources().getString(R.string.DesLa),
                R.drawable.laguna,R.drawable.laguna2,"#F44336","#FFFFFF"));
        equipos.add(new Equipo(getResources().getString(R.string.volcan),getResources().getString(R.string.desvol),R.drawable.volcan1,R.drawable.volcan2,"#FFFF00","#000000"));
        equipos.add(new Equipo(getResources().getString(R.string.museo),getResources().getString(R.string.desmuseo),R.drawable.museo1,R.drawable.museo1,"#2196F3","#FFFFFF"));
        equipos.add(new Equipo(getResources().getString(R.string.muscar),getResources().getString(R.string.desmucar),R.drawable.museocarnaval2,R.drawable.museocarnaval2
                ,"#F44336","#FFFFFF"));

        listado.setLayoutManager(new LinearLayoutManager(myContext,LinearLayoutManager.VERTICAL,false));
        listado.addItemDecoration(new DividerItemDecoration(myContext,DividerItemDecoration.VERTICAL_LIST));

        listado.setHasFixedSize(true);
        EquiposAdapter adapter = new EquiposAdapter(myContext,equipos);
        listado.setAdapter(adapter);
        return view;
    }




}
