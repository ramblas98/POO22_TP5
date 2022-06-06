/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej1;

/**
 *
 * @author profeblas
 */
public class Inmueble implements Rentable {
    private String direccion;
    private String tipo;
    private double valor;
    private int anios;

    public Inmueble() {
    }

    public Inmueble(String direccion, String tipo, double valor, int anios) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
        this.anios = anios;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getAnios() {
        return anios;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public void alquilar(int periodo) {
        this.anios = periodo;
    }

    @Override
    public boolean alquilado() {
        return (this.anios>0);
    }

    @Override
    public void desocupar() {
        this.anios = 0;
    }
    
    
    
}
