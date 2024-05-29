package com.curso.service;

import com.curso.model.Producto;

import java.util.List;

public interface ProductosService {

    // Método que devuelve la lista de productos
    List<Producto> listaProductos();

    // Método que actualiza el stock del producto
    void actualizarStock(String codigo, int unidadesCompradas);
    //Método que agrega un nuevo prodructo
    
    void agregarProducto(Producto producto);

    // Método para obtener el precio de un producto por su código
    double obtenerPrecioPorCodigo(String codigo);
}
