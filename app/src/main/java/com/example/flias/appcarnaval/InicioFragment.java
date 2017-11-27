package com.example.flias.appcarnaval;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.ImageButton;


public class InicioFragment extends Fragment {
    View view;
    private FragmentActivity myContext;
    ImageButton ponencia , sitios, mapas2;

    private AdapterViewFlipper IVF;

    int images[]={R.drawable.carnaval5,R.drawable.carnaval3};
    String names[]={"imagen1", "imagen2"};

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_inicio, container, false);
        ponencia = (ImageButton) view.findViewById(R.id.btnmapa);
        sitios = (ImageButton) view.findViewById(R.id.btnsitios);
        mapas2 = (ImageButton) view.findViewById(R.id.btnmapa2);
        IVF=(AdapterViewFlipper) view.findViewById(R.id.IVF);
        CustomAdapter custom= new CustomAdapter(myContext.getApplicationContext(),names,images);
        IVF.setAdapter(custom);
        IVF.setFlipInterval(2000);
        IVF.setAutoStart(true);


        ponencia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent miIntent = new Intent(myContext, MapsFragment.class);
                startActivity(miIntent);
            }


        });

        mapas2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  Log.e("fdgfdfgfgfgfh--->","SI");
                Fragment fragment = null;
                Class fragmentClass= Programa2Fragment.class;
                try{
                    fragment = (Fragment) fragmentClass.newInstance();
                }catch (Exception e){
                    e.printStackTrace();
                }
                FragmentManager fragmentManager=myContext.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

            }
        });





        sitios.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  Log.e("fdgfdfgfgfgfh--->","SI");
                Fragment fragment = null;
                Class fragmentClass= SitiosFragment.class;
                try{
                    fragment = (Fragment) fragmentClass.newInstance();
                }catch (Exception e){
                    e.printStackTrace();
                }
                FragmentManager fragmentManager=myContext.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

            }
        });

        return view;
    }










}

