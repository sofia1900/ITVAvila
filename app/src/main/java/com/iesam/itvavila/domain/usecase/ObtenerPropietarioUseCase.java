package com.iesam.itvavila.domain.usecase;

import com.iesam.itvavila.data.PropietarioDataStore;
import com.iesam.itvavila.domain.models.Propietario;

public class ObtenerPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public Propietario execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
