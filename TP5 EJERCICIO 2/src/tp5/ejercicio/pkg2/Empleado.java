/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio.pkg2;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Empleado implements Comparable{
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double dni;
    private int anio;

    public Empleado() {
        this.apellido = " ";
        this.nombre = " ";
        this.fechaNacimiento = null;
        this.dni = 0;
        this.anio = 0;
    }

    public Empleado(String apellido, String nombre, LocalDate fechaNacimiento, double dni, int anio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.anio = anio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int compareTo(Object o) {
        Empleado otro = (Empleado)o;
        return (this.nombre.compareTo(otro.getNombre()));
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ",apellido= " + apellido + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + ", anio=" + anio + '}';
    }
        
}
