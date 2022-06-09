/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio.pkg3;

/**
 *
 * @author USUARIO
 */
public class Gato extends Animal implements Hablador{

    public Gato() {
    }

    public Gato(String raza, String sexo, int edad) {
        super(raza, sexo, edad);
    }
        
    @Override
    public void saluda() {
        System.out.println("miau miau miau");
    }
    
}
