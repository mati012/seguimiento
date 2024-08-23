package com.segumiento.seguimiento;

public class Envio {
    private long id;
    private String producto;
    private String destino;
    private String estado;
    private String ubicacionActual;


    public Envio(long id, String producto, String destino, String estado, String ubicacionActual ){
        this.id = id;
        this.producto = producto;
        this.destino = destino;
        this.estado = estado;
        this.ubicacionActual = ubicacionActual;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }
    
}
