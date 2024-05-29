package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    @Column(name = "cod_curso")
    private int codCurso;
    private String nombre;
    private int duracion;
    private double precio;

    public Curso() {
    }

    public Curso(int codCurso, String nombre, int duracion, double precio) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    

    public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso == curso.codCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codCurso=" + codCurso +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", precio=" + precio +
                '}';
    }
}
