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
    private ArrayList<Fruta> lista;

    public Canasta() {
        this.lista = new ArrayList<>();
    }

    public void agregarFruta(Fruta fruta) {
        this.lista.add(fruta);
    }

    public ArrayList<Fruta> getLista() {
        return lista;
    }

    public double obtenerTotal() {
        double total = 0;
        for (Fruta f : lista) {
            total += f.getPrecio();
        }
        return total;
    }

    public void vaciarCanasta() {
        this.lista.clear();
    }
    
    public void eliminarFruta(int indice) {
    if (indice >= 0 && indice < lista.size()) {
        lista.remove(indice);
    }
}
}

