/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej1;

import java.util.Objects;

/**
 *
 * @author profeblas
 */
public class Disfraz implements Rentable, Comparable{
    private String personaje;
    private char talle;
    private int dias;
    private double precio;

    public Disfraz() {
    }

    public Disfraz(String personaje, char talle, int dias, double precio) {
        this.personaje = personaje;
        this.talle = talle;
        this.dias = dias;
        this.precio = precio;
    }

    public String getPersonaje() {
        return personaje;
    }

    public char getTalle() {
        return talle;
    }

    public int getDias() {
        return dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void alquilar(int periodo) {
        this.dias = periodo;
    }

    @Override
    public boolean alquilado() {
        return (this.dias>0);
    }

    @Override
    public void desocupar() {
        this.dias=0;
    }

    @Override
    public int compareTo(Object t) {
        // Orden Natural con personaje
        Disfraz d2 = (Disfraz) t;
        return (this.personaje.compareTo(d2.personaje));
    }

    @Override
    public String toString() {
        return "Disfraz{ " + "personaje=" + personaje + ", talle=" + talle + ", dias=" + dias + ", precio=" + precio + '}';
    }

    
}
