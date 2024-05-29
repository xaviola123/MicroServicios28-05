package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Pedido;

@Service
public class PedidosServiceImpl implements PedidosService {

    @Autowired
    private RestTemplate restTemplate;

    private final String urlPedidos = "http://localhost:8000/pedidos";
    

    @Override
    public void agregarPedido(Pedido pedido) {
        restTemplate.postForObject(urlPedidos, pedido, Pedido.class);
    }

    @Override
    public List<Pedido> obtenerPedidos() {
        Pedido[] pedidos = restTemplate.getForObject(urlPedidos, Pedido[].class);
        return Arrays.asList(pedidos);
    }
}
