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
public class Categoria {
    String categoria;
    int id;

    public Categoria() {
    }

    public Categoria(String categoria, int id) {
        this.categoria = categoria;
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return categoria;
    }
    
    
}
