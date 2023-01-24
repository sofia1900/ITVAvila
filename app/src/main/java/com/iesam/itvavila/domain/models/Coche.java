package com.iesam.itvavila.domain.models;

public class Coche implements Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String annioMatriculacion;
    private Integer numPuertas;

    @Override
    public String getMatricula() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnnioMatriculacion() {
        return annioMatriculacion;
    }

    public void setAnnioMatriculacion(String annioMatriculacion) {
        this.annioMatriculacion = annioMatriculacion;
    }

    public Integer getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }
}
