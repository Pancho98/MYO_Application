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
public class Producto {
    String nombre;
    String descripcion;
    String area;
    String estado;
    String cantidad;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, String area, String estado, String cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.area = area;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
