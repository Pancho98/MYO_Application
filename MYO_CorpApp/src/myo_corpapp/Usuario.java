/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myo_corpapp;

/**
 *
 * @author Francisco Santos
 */
public class Usuario {
    String username;
    String contraseña;
    String nombre;

    public Usuario() {
    }

    public Usuario(String username, String contraseña, String nombre) {
        this.username = username;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
}
