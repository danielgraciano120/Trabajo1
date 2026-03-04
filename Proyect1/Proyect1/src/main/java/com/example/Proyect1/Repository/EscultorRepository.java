package com.example.Proyect1.Repository;

import com.example.Proyect1.Entity.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EscultorRepository {

    public List<Escultor> obtenerEscultores(String nombreMarmol, String nombreMadera, String nombreDigital) {

        List<Escultor> lista = new ArrayList<>();

        lista.add(new EscultorMarmol(nombreMarmol));
        lista.add(new EscultorMadera(nombreMadera));
        lista.add(new EscultorDigital(nombreDigital));

        return lista;
    }

    public List<EscultorAbstracto> obtenerEscultoresAbstractos(String nombreMarmol, String nombreMadera, String nombreDigital) {

        List<EscultorAbstracto> lista = new ArrayList<>();

        lista.add(new EscultorMarmolAbstracto(nombreMarmol, 15, "Mármol de Carrara"));
        lista.add(new EscultorMaderaAbstracto(nombreMadera, 10, "Cedro Rojo"));
        lista.add(new EscultorDigitalAbstracto(nombreDigital, 5, "ZBrush + Blender"));

        return lista;
    }
}
