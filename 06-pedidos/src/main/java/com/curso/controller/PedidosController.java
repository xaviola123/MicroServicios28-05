package com.curso.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidosService;

@RestController

public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @PostMapping(value = "pedidos/agregar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregarPedido(@RequestBody Pedido pedido) {
        pedidosService.agregarPedido(pedido);
    }

    @GetMapping(value = "pedidos/obtener", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> obtenerPedidos() {
        return pedidosService.obtenerPedidos();
    }
}
