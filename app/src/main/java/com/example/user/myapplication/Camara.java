package com.example.user.myapplication;

import com.orm.SugarRecord;

/**
 * Created by Mariord on 25/11/2016.
 */
public class Camara{
    private String marca;
    private String resolucion;
    private String precio;
    private String tipo;
    private int imagen;


    public Camara(String marca, String resolucion, String precio, String tipo, int imagen) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.precio = precio;
        this.tipo = tipo;
        this.imagen = imagen;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
