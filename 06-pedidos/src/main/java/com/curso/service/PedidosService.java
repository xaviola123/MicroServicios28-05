package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidosService {

    
    void agregarPedido(Pedido pedido);
    List<Pedido> obtenerPedidos();
}
