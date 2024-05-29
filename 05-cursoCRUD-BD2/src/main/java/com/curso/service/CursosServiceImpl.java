package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {

    @Autowired
    private CursosDao cursosDao;

    @Override
    public List<Curso> cursos() {
        return cursosDao.findAll();
    }

    @Override
    public Curso buscarCurso(int codCurso) {
        return cursosDao.findById(codCurso).orElse(null);
    }

    @Override
    public void altaCurso(Curso curso) {
        cursosDao.save(curso);
    }

    @Override
    public void actualizarDuracion(int codCurso, int duracion) {
        Curso curso = cursosDao.findById(codCurso).orElse(null);
        if (curso != null) {
            curso.setDuracion(duracion);
            cursosDao.save(curso);
        }
    }

    @Override
    public List<Curso> eliminarCurso(int codCurso) {
        cursosDao.deleteById(codCurso);
        return cursosDao.findAll();
    }

    @Override
    public List<Curso> cursosPorPrecio(double precioMin, double precioMax) {
        return cursosDao.cursosPorPrecio(precioMin, precioMax);
    }
}
