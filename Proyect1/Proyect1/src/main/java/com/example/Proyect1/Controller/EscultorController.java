package com.example.Proyect1.Controller;


import com.example.Proyect1.Entity.Escultor;
import com.example.Proyect1.Entity.EscultorAbstracto;
import com.example.Proyect1.Repository.EscultorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/escultores")
public class EscultorController {

    @Autowired
    private EscultorRepository repository;

    // Parte 1 - Interfaces
    @GetMapping
    public String mostrarPagina(
            @RequestParam(required = false) String nombreMarmol,
            @RequestParam(required = false) String nombreMadera,
            @RequestParam(required = false) String nombreDigital,
            Model model) {

        if (nombreMarmol != null && nombreMadera != null && nombreDigital != null) {
            model.addAttribute("escultores", repository.obtenerEscultores(nombreMarmol, nombreMadera, nombreDigital));
            model.addAttribute("nombreMarmol", nombreMarmol);
            model.addAttribute("nombreMadera", nombreMadera);
            model.addAttribute("nombreDigital", nombreDigital);
        } else {
            model.addAttribute("escultores", List.of());
        }

        model.addAttribute("escultoresAbstractos", List.of());
        return "escultores";
    }

    // Parte 2 - Clases Abstractas
    @GetMapping("/abstractas")
    public String mostrarAbstractas(
            @RequestParam(required = false) String nombreMarmol,
            @RequestParam(required = false) String nombreMadera,
            @RequestParam(required = false) String nombreDigital,
            Model model) {

        if (nombreMarmol != null && nombreMadera != null && nombreDigital != null) {
            model.addAttribute("escultoresAbstractos", repository.obtenerEscultoresAbstractos(nombreMarmol, nombreMadera, nombreDigital));
            model.addAttribute("nombreMarmolAbs", nombreMarmol);
            model.addAttribute("nombreMaderaAbs", nombreMadera);
            model.addAttribute("nombreDigitalAbs", nombreDigital);
        } else {
            model.addAttribute("escultoresAbstractos", List.of());
        }

        model.addAttribute("escultores", List.of());
        return "escultores";
    }
}