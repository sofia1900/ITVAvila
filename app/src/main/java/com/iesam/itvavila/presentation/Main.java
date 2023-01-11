package com.iesam.itvavila.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iesam.itvavila.R;
import com.iesam.itvavila.domain.models.Camion;
import com.iesam.itvavila.domain.models.Coche;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear camión
        Camion camion = new Camion();
        camion.setMarca("Mercedes");
        camion.setModelo("Vette");
        camion.setColor("Negro");
        camion.setAnnioMatriculacion("2021");
        camion.setMatricula("0001-GTY");
        camion.setLon("10m");
        camion.setTara("3000kg");

        //Crear coche
        Coche coche = new Coche();
        coche.setMarca("Seat");
        coche.setModelo("León");
        coche.setColor("Verde");
        coche.setAnnioMatriculacion("2022");
        coche.setMatricula("0000-GYU");
        coche.setNumPuertas(5);


    }
}