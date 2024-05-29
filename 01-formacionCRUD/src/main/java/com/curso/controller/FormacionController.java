package com.curso.controller;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormacionController {

    @Autowired
    private FormacionService formacionService;

    @GetMapping(value = "formacion/cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> listaCursos() {
        return formacionService.listaCursos();
    }

    @PostMapping(value = "formacion/alta", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso(@RequestBody Formacion formacion) {
        formacionService.altaCurso(formacion);
    }
}
