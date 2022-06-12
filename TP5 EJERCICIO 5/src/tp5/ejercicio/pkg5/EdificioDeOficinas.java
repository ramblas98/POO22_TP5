/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio.pkg5;

/**
 *
 * @author USUARIO
 */
public class EdificioDeOficinas implements Edificio{
    private int numeroOficinas;
    
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public double getSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
