package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursosService {

    List<Curso> cursos();

    Curso buscarCurso(int codCurso);

    void altaCurso(Curso curso);

    void actualizarDuracion(int codCurso, int duracion);

    List<Curso> eliminarCurso(int codCurso);

    List<Curso> cursosPorPrecio(double precioMin, double precioMax);
}
