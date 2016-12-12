package com.example.user.myapplication;

/**
 * Created by Mariord on 28/11/2016.
 */
public class Menu {
    private String numTelefono;
    private String correo;
    private String direccion;
    private int logo;

    public Menu(String numTelefono, String correo, String direccion, int logo) {
        this.numTelefono = numTelefono;
        this.correo = correo;
        this.logo = logo;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
