/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author celia
 */
public class Canasta {
    private ArrayList<Fruta> listaFrutas;

    public Canasta() {
        this.listaFrutas = new ArrayList<>();
    }

    public void agregarFruta(Fruta f) {
        this.listaFrutas.add(f);
    }
    
    // Método para calcular el total
    public double calcularTotal() {
        return listaFrutas.stream().mapToDouble(Fruta::getPrecio).sum();
    }
}

