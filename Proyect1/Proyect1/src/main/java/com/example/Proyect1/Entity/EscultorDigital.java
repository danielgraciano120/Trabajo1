package com.example.Proyect1.Entity;

public class EscultorDigital extends EscultorBase {

    public EscultorDigital(String nombre) {
        super(nombre);
    }

    @Override
    public String crearEscultura() {
        return nombre + " talla una escultura clásica en mármol.";
    }
    @Override
    public String getTipoEscultor() {
        return "Escultor Digital";
    }
}