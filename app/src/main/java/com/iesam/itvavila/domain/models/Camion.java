package com.iesam.itvavila.domain.models;

public class Camion implements Vehiculo{
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String annioMatriculacion;
    private String tara;
    private String lon;

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

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
