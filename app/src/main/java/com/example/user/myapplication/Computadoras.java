package com.example.user.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
/**
 * Created by Mariord on 18/11/2016.
        */
public class Computadoras {

    private String discoduro;
    private String procesador;
    private String ram;
    private String precio;
    private int img;

    public Computadoras(String discoduro, String procesador, String ram, String precio, int img) {
        this.discoduro = discoduro;
        this.procesador = procesador;
        this.ram = ram;
        this.precio = precio;
        this.img = img;
    }

    public Computadoras(){

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(String discoduro) {
        this.discoduro = discoduro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
