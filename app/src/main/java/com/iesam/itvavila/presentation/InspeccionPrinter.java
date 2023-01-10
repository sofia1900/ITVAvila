package com.iesam.itvavila.presentation;
import android.util.Log;

import com.iesam.itvavila.domain.models.Inspeccion;

public class InspeccionPrinter {
    public void imprimir(Inspeccion inspeccion) {
        Log.d("@sof","Cód. Inspección:" + inspeccion.getCodigo());
        Log.d("@sof","Fecha Inspección:" + inspeccion.getFecha());
        Log.d("@sof","Resultado Inspección:" + inspeccion.getResultado());
        Log.d("@sof", "Propietario: " + inspeccion.getPropietario().getDni() + " " + inspeccion.getPropietario().getNombre() + " " + inspeccion.getPropietario().getApellidos());
        Log.d("@sof","Vehículo: " + inspeccion.getVehiculo().getMatricula() + " " + inspeccion.getVehiculo().getMarca() + " " + inspeccion.getVehiculo().getModelo());
        Log.d("@sof","---------------------------------------");

    }
}
