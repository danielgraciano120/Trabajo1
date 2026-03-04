package com.example.Proyect1.Entity;

public class EscultorMadera extends EscultorBase {

    public EscultorMadera(String nombre) {
        super(nombre);
    }

    @Override
    public String crearEscultura() {
        return nombre + " talla una escultura en madera de cedro.";
    }

    @Override
    public String getTipoEscultor() {
        return "Escultor en Madera";
    }
}