package com.curso.dao;

import com.curso.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosDao extends JpaRepository<Producto, String> {
}
