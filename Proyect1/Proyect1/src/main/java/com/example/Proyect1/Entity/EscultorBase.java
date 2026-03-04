package com.example.Proyect1.Entity;

public abstract class EscultorBase implements Escultor {

    protected String nombre;

    public EscultorBase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto que obliga a las subclases
    @Override
    public abstract String crearEscultura();
}