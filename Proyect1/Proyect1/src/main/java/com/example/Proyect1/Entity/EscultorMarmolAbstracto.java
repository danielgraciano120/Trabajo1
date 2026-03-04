package com.example.Proyect1.Entity;

public class EscultorMarmolAbstracto extends EscultorAbstracto {

    private String tipoMarmol;

    public EscultorMarmolAbstracto(String nombre, int aniosExperiencia, String tipoMarmol) {
        super(nombre, aniosExperiencia, "Mármol");
        this.tipoMarmol = tipoMarmol;
    }

    @Override
    public String crearEscultura() {
        return "[Abstracta - Mármol] " + nombre + " trabaja con " + tipoMarmol + ". " +
                "Traza el boceto en la piedra, usa el puntero para desbastar, el gradino para " +
                "los planos y el cincel plano para los detalles. " +
                "Con " + aniosExperiencia + " años, cada golpe es calculado.";
    }

    public String getTipoMarmol() { return tipoMarmol; }
}