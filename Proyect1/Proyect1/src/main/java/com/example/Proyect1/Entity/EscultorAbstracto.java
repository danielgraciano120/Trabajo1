package com.example.Proyect1.Entity;

public abstract class EscultorAbstracto {

    protected String nombre;
    protected int aniosExperiencia;
    protected String materialPrincipal;

    public EscultorAbstracto(String nombre, int aniosExperiencia, String materialPrincipal) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.materialPrincipal = materialPrincipal;
    }

    // Método abstracto: cada subclase DEBE sobreescribirlo con @Override
    public abstract String crearEscultura();

    // Método concreto compartido: todas las subclases lo heredan sin sobreescribir
    public String presentarse() {
        return "Soy " + nombre + ", tengo " + aniosExperiencia +
                " años de experiencia y trabajo con " + materialPrincipal + ".";
    }

    public String getNombre() { return nombre; }
    public int getAniosExperiencia() { return aniosExperiencia; }
    public String getMaterialPrincipal() { return materialPrincipal; }
}
