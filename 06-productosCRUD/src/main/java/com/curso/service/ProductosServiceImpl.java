package com.curso.service;

import com.curso.dao.ProductosDao;
import com.curso.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {

    @Autowired
    private ProductosDao productosDao;

    @Override
    public List<Producto> listaProductos() {
        return productosDao.findAll();
    }

    @Override
    public void actualizarStock(String codigo, int unidadesCompradas) {
        Producto producto = productosDao.findById(codigo).orElse(null);
        if (producto != null && producto.getStock() >= unidadesCompradas) {
            producto.setStock(producto.getStock() - unidadesCompradas);
            productosDao.save(producto);
        }
		        
    }

    @Override
    public double obtenerPrecioPorCodigo(String codigo) {
        Producto producto = productosDao.findById(codigo).orElse(null);
        if (producto != null) {
            return producto.getPrecio();
        } else {
            return 0.0;
        }
    }

	@Override
	public void agregarProducto(Producto producto) {
		
		productosDao.save(producto);
	}
}
