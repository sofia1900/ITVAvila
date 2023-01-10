package com.iesam.itvavila.domain.usecase;

import com.iesam.itvavila.data.InspeccionDataStore;
import com.iesam.itvavila.domain.models.Inspeccion;

public class ObtenerInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public Inspeccion execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
