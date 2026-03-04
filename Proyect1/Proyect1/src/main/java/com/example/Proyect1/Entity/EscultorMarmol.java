package com.example.Proyect1.Entity;

public class EscultorMarmol extends EscultorBase {

    public EscultorMarmol(String nombre) {
        super(nombre);
    }

    @Override
    public String crearEscultura() {
        return nombre + " diseña una escultura 3D digital.";
    }

    @Override
    public String getTipoEscultor() {
        return "Escultor en Mármol";
    }
}