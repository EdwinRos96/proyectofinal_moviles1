package com.example.user.myapplication;

/**
 * Created by Mariord on 22/11/2016.
 */
public class Almacenamiento {
    private String nombre;
    private String marca;
    private String precio;
    private int img;

    public Almacenamiento(String nombre, String marca, String precio, int img) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
