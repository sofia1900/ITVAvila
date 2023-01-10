package com.iesam.itvavila.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iesam.itvavila.R;
import com.iesam.itvavila.domain.models.Camion;
import com.iesam.itvavila.domain.models.Coche;
import com.iesam.itvavila.domain.models.Inspeccion;
import com.iesam.itvavila.domain.models.Propietario;
import com.iesam.itvavila.domain.usecase.GuardarInspeccionUseCase;
import com.iesam.itvavila.domain.usecase.GuardarPropietarioUseCase;
import com.iesam.itvavila.domain.usecase.GuardarVehiculoUseCase;
import com.iesam.itvavila.domain.usecase.ObtenerInspeccionUseCase;
import com.iesam.itvavila.domain.usecase.ObtenerPropietarioUseCase;
import com.iesam.itvavila.domain.usecase.ObtenerVehiculoUseCase;

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

        //Guardo el camión como vehículo
        GuardarVehiculoUseCase guardarVehiculoUseCase = new GuardarVehiculoUseCase();
        guardarVehiculoUseCase.execute(camion);

        //Crear coche
        Coche coche = new Coche();
        coche.setMarca("Seat");
        coche.setModelo("León");
        coche.setColor("Verde");
        coche.setAnnioMatriculacion("2022");
        coche.setMatricula("0000-GYU");
        coche.setNumPuertas(5);

        //Guardo el coche como vehículo que es. Nota: No hace falta crear una nueva instancia del caso de uso.
        guardarVehiculoUseCase.execute(coche);

        //Crear Propietario
        Propietario propietario = new Propietario();
        propietario.setCodigo("1");
        propietario.setDni("1234567-M");
        propietario.setNombre("Propetario1");
        propietario.setApellidos("Apellido1 Apellido2");
        propietario.setDomicilio("Calle Jarama");
        propietario.setPoblacion("Ávila");
        propietario.setProvincia("Ávila");
        propietario.setTelefono("700 000 000");

        //Guardo con Caso de Uso (en memoria)
        GuardarPropietarioUseCase guardarPropietarioUseCase = new GuardarPropietarioUseCase();
        guardarPropietarioUseCase.execute(propietario);

        //Creo un caso de uso para recuperar vehículos
        ObtenerVehiculoUseCase obtenerVehiculoUseCase = new ObtenerVehiculoUseCase();

        //Creo un caso de uso para recuperar propietario
        ObtenerPropietarioUseCase obtenerPropietarioUseCase = new ObtenerPropietarioUseCase();

        //Crear inspección 1
        Inspeccion inspeccion = new Inspeccion();
        inspeccion.setCodigo("1");
        inspeccion.setFecha("15-12-2022");
        inspeccion.setResultado(true);
        inspeccion.setPropietario(propietario);
        inspeccion.setVehiculo(coche);

        //Guardo la inspección
        GuardarInspeccionUseCase guardarInspeccionUseCase = new GuardarInspeccionUseCase();
        guardarInspeccionUseCase.execute(inspeccion);

        //Crear inspección 2
        Inspeccion inspeccion2 = new Inspeccion();
        inspeccion2.setCodigo("2");
        inspeccion2.setFecha("15-12-2022");
        inspeccion2.setResultado(false);
        inspeccion2.setPropietario(propietario);
        inspeccion2.setVehiculo(camion);

        //Guardo la inspección.
        guardarInspeccionUseCase.execute(inspeccion2);

        //Creo caso de uso para recuperar inspecciones
        ObtenerInspeccionUseCase obtenerInspeccionUseCase = new ObtenerInspeccionUseCase();

        InspeccionPrinter inspeccionPrinter = new InspeccionPrinter();
        //Imprimo la inspección 1
        inspeccionPrinter.imprimir(inspeccion);
        //Imprimo la inspección 2
        inspeccionPrinter.imprimir(inspeccion2);


    }
}