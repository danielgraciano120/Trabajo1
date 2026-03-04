package com.example.Proyect1.Entity;

public class EscultorDigitalAbstracto extends EscultorAbstracto {

    private String softwareUsado;

    public EscultorDigitalAbstracto(String nombre, int aniosExperiencia, String softwareUsado) {
        super(nombre, aniosExperiencia, "Digital/3D");
        this.softwareUsado = softwareUsado;
    }

    @Override
    public String crearEscultura() {
        return "[Abstracta - Digital] " + nombre + " usa " + softwareUsado + ". " +
                "Crea esfera base en DynaMesh, usa ClayBuild para volumen, Dam_Standard para cortes, " +
                "subdivide x6 para máximo detalle y exporta UV para render fotorrealista. " +
                "Con " + aniosExperiencia + " años domina tanto el arte como la técnica 3D.";
    }

    public String getSoftwareUsado() { return softwareUsado; }
}