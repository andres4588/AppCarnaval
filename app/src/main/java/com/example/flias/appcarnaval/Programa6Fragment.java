package com.example.flias.appcarnaval;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Programa6Fragment extends Fragment {

    View view;
    private FragmentActivity myContext;
    Button sig ,sig2 , salir;

    public Programa6Fragment() {
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

        view = inflater.inflate(R.layout.fragment_programa6, container, false);
        sig = (Button) view.findViewById(R.id.button7);
        sig2 = (Button) view.findViewById(R.id.button8);



        sig.setOnClickListener(new View.OnClickListener() {
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

        sig2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  Log.e("fdgfdfgfgfgfh--->","SI");
                Fragment fragment = null;
                Class fragmentClass= Programa4Fragment.class;
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

