package com.curso.model;

import java.util.Objects;

public class CursoAuxiliar {
	private String nombre;
	private int duracion;
	private double precio;

	public CursoAuxiliar() {
	}

	public CursoAuxiliar(String nombre, int duracion, double precio) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}

	// Getters y setters
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
	public int hashCode() {
		return Objects.hash(duracion, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursoAuxiliar other = (CursoAuxiliar) obj;
		return duracion == other.duracion && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		return "CursoAuxiliar{" + "nombre='" + nombre + '\'' + ", duracion=" + duracion + ", precio=" + precio + '}';
	}
}
