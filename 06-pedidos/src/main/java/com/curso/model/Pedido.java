package com.curso.model;

import java.util.List;

public class Pedido {
    private int id;
    private List<ItemPedido> items;

    public Pedido() {
    }

    public Pedido(int id, List<ItemPedido> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }
    
    
}
