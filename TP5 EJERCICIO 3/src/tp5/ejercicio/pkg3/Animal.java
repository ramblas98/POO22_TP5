/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio.pkg3;

/**
 *
 * @author USUARIO
 */
public abstract class Animal {
    private String raza;
    private String sexo;
    private int edad;
    
    public Animal() {
        this.raza = "null";
        this.sexo = "null";
        this.edad = 0;
    }
    
    public Animal(String raza, String sexo, int edad) {
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
