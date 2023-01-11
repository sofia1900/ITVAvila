package com.iesam.itvavila.data;

import com.iesam.itvavila.domain.models.Propietario;

import java.util.Map;
import java.util.TreeMap;

public class PropietarioDataStore {
    private static PropietarioDataStore instance = null;

    private Map<String, Propietario> dataStore = new TreeMap<>();

    public void guardar(Propietario model) {
        dataStore.put(model.getCodigo(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Propietario buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Propietario model) {
        dataStore.put(model.getCodigo(), model);
    }

    public static PropietarioDataStore getInstance() {
        if (instance == null) {
            instance = new PropietarioDataStore();
        }
        return instance;
    }
}
