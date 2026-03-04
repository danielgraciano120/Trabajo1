package com.example.Proyect1.Entity;

public class EscultorMaderaAbstracto extends EscultorAbstracto {

    private String tipoMadera;

    public EscultorMaderaAbstracto(String nombre, int aniosExperiencia, String tipoMadera) {
        super(nombre, aniosExperiencia, "Madera");
        this.tipoMadera = tipoMadera;
    }

    @Override
    public String crearEscultura() {
        return "[Abstracta - Madera] " + nombre + " trabaja con madera de " + tipoMadera + ". " +
                "Seca la madera meses antes, usa gubia en U para zonas cóncavas, formón para detalles, " +
                "lija en tres granos y aplica aceite de tung para resaltar la veta. " +
                "Sus " + aniosExperiencia + " años le permiten trabajar a favor del grano.";
    }

    public String getTipoMadera() { return tipoMadera; }
}