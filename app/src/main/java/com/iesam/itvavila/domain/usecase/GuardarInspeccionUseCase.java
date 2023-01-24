package com.iesam.itvavila.domain.usecase;

import com.iesam.itvavila.data.InspeccionDataStore;
import com.iesam.itvavila.domain.models.Inspeccion;

public class GuardarInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion model) {
        dataStore.guardar(model);
    }
}
