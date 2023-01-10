package com.iesam.itvavila.domain.usecase;

import com.iesam.itvavila.data.VehiculoDataStore;
import com.iesam.itvavila.domain.models.Vehiculo;

public class GuardarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo model) {
        dataStore.guardar(model);
    }
}
