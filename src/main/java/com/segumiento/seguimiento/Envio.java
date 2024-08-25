package com.segumiento.seguimiento;

import java.util.List;

public class Envio {
    private int idEnvio;
    private String destino;
    private String estado;
    private String ubicacionActual;
    private List<Producto> productos;


    public Envio(int idEnvio, String destino, String estado, String ubicacionActual, List<Producto> productos ){
        this.idEnvio = idEnvio;
        this.destino = destino;
        this.estado = estado;
        this.ubicacionActual = ubicacionActual;
        this.productos = productos;

    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
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
    
    public List<Producto> getProductos(){
        return productos;
    }
}
