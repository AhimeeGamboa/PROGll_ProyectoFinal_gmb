/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author celia
 */
    public class FrutaEspecial extends Fruta {
        private String pais;
        private String temporada;

        public FrutaEspecial(int id, String nombre, double precio, String pais, String temporada) {
            
            super(id, nombre, precio); 
            this.pais = pais;
            this.temporada = temporada;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public String getTemporada() {
            return temporada;
        }

        public void setTemporada(String temporada) {
            this.temporada = temporada;
        }
    }