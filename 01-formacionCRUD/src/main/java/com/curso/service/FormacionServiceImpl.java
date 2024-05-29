package com.curso.service;

import com.curso.model.CursoAuxiliar;
import com.curso.model.Formacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormacionServiceImpl implements FormacionService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String CURSOS_URL = "http://localhost:8080/cursos";
    private static final String ALTA_CURSO_URL = "http://localhost:8080/cursos/alta";

    @Override
    public List<Formacion> listaCursos() {
        CursoAuxiliar[] cursosResponse = restTemplate.getForObject(CURSOS_URL, CursoAuxiliar[].class);
        List<Formacion> formaciones = new ArrayList<>();
        for (CursoAuxiliar cursoResponse : cursosResponse) {
            int asignaturas = calcularAsignaturas(cursoResponse.getDuracion());
            formaciones.add(new Formacion(cursoResponse.getNombre(), asignaturas, cursoResponse.getPrecio()));
        }
        return formaciones;
    }

    @Override
    public void altaCurso(Formacion formacion) {
        int duracion = calcularDuracion(formacion.getAsignaturas());
        CursoAuxiliar curso = new CursoAuxiliar(formacion.getCurso(), duracion, formacion.getPrecio());
        restTemplate.postForLocation(ALTA_CURSO_URL, curso);
    }

    private int calcularAsignaturas(int duracion) {
        int asignaturas;
        if (duracion >= 50) {
            asignaturas = 10;
        } else {
            asignaturas = 5;
        }
        return asignaturas;
    }

    private int calcularDuracion(int asignaturas) {
        return asignaturas * 10;
    }
}
