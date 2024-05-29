package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Curso;
import com.curso.service.CursosService;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursosService cursosService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos() {
        return cursosService.cursos();
    }

    @GetMapping(value = "/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable int codCurso) {
        return cursosService.buscarCurso(codCurso);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> agregarCurso(@RequestBody Curso curso) {
        cursosService.altaCurso(curso);
        return cursosService.cursos();
    }

    @DeleteMapping(value = "/{codCurso}")
    public List<Curso> eliminarCurso(@PathVariable int codCurso) {
        cursosService.eliminarCurso(codCurso);
        return cursosService.cursos();
    }

    @PutMapping(value = "/{codCurso}/{duracion}")
    public void actualizarDuracion(@PathVariable int codCurso, @PathVariable int duracion) {
        cursosService.actualizarDuracion(codCurso, duracion);
    }

    @GetMapping(value = "/porPrecio", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursosPorPrecio(@RequestParam double precioMin, @RequestParam double precioMax) {
        return cursosService.cursosPorPrecio(precioMin, precioMax);
    }
}
