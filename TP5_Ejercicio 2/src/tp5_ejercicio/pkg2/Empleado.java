
package tp5_ejercicio.pkg2;

//import java.util.GregorianCalendar
import java.time.LocalDate;

public class Empleado {
    private String nombres;
    private String apellidos;
    private LocalDate fechaNac;
    private long dni;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(String nombres, String apellidos, LocalDate fechaNac, long dni, int anioIngreso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
    }
    
    
    
    
}
