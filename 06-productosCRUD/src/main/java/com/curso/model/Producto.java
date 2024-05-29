package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id
    @Column(name="cod_producto")
    private String codProducto; 
    private String nombre;
    private int stock;
    private double precio;
    
    public Producto() {
        super();
    }
    
    public Producto(String codProducto, String nombre, int stock, double precio) {
        super();
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
    
    public String getCodProducto() {
        return codProducto;
    }
    
    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(codProducto, nombre, stock, precio);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        return Objects.equals(codProducto, other.codProducto) && Objects.equals(nombre, other.nombre)
                && stock == other.stock && Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
    }
    
    @Override
    public String toString() {
        return "Producto [codProducto=" + codProducto + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio
                + "]";
    }
}
