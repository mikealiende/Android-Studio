package com.example.herramientas;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class Menu extends Fragment {

    private final int[] BOTONESMENU = {R.id.linterna,R.id.sonido,R.id.nivel};

    public Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_menu1, container, false);

        ImageButton botonmenu;

        //Pomemos todos los botones de menu a la escucha del click
        for(int i = 0; i<BOTONESMENU.length;i++){
            botonmenu=(ImageButton)mimenu.findViewById(BOTONESMENU[i]);
            final int queboton = i;
            botonmenu .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Activity estaActividad = getActivity(); //Alacenamos en que activadad nos encontramos
                    ((ComunicaMenu)estaActividad).menu(queboton);
                }
            });
        }

        return mimenu;
    }
}