
package tp5_ejercicio.pkg2;

import java.time.LocalDate;

public class Empleado implements Comparable{
    private String nombres;
    private String apellidos;
    private LocalDate fNac;
    private long dni;
    private int anioIngreso;

    public Empleado(String nombres, String apellidos, LocalDate fNac, long dni, int anioIngreso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fNac = fNac;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public long getDni() {
        return dni;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public int compareTo(Object o) {
        Empleado o1 = (Empleado)o;
        return this.fNac.compareTo(o1.fNac);
    }
    
    
}
