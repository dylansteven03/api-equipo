package com.equipo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    // Endpoint base — no modificar
    @GetMapping
    public List<String> integrantes() {
        return List.of("Equipo listo. Cada integrante agrega su endpoint abajo.");
    }

    // ─────────────────────────────────────────────────────────────────
    // ZONA DE TRABAJO DEL EQUIPO
    // Cada integrante del equipo agrega su método en esta sección.
    // Rama: feature/tu-nombre
    // ─────────────────────────────────────────────────────────────────
@GetMapping("/dylan")
    public String saludo() {
        return "Hola, soy Dylan y este es mi endpoint.";
    }

@GetMapping("/Valentina")
    public String saludoValentina() {
        return "Hola, soy Valentina y este es mi endpoint.";
    }

@GetMapping("/Brian")
    public String saludoBrian() {
        return "Hola, soy Brian y este es mi endpoint.";
    }

@GetMapping("/Jonatan")
    public String saludoJonatan() {
        return "Hola, soy Jonatan y este es mi endpoint.";
    }

}
