package com.curso.model;

public class ItemPedido {
    private String codigoProducto;
    private int cantidad;

    public ItemPedido() {
    }

    public ItemPedido(String codigoProducto, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
