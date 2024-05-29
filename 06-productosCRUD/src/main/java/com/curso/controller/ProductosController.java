package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductosService;

@RestController
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping(value = "/productos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> listaProductos() {
        return productosService.listaProductos();
    }

    @PutMapping(value = "/productos/{codigo}/{unidadesCompradas}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarStock(@PathVariable String codigo, @PathVariable int unidadesCompradas) {
        productosService.actualizarStock(codigo, unidadesCompradas);
    }

    @GetMapping(value = "/productos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public double obtenerPrecioPorCodigo(@PathVariable String codigo) {
        return productosService.obtenerPrecioPorCodigo(codigo);
    }
    
    @PostMapping(value="/productos", consumes= MediaType.APPLICATION_JSON_VALUE)
    public void agregarProducto(@RequestBody Producto producto) {
        productosService.agregarProducto(producto);
    }

}
