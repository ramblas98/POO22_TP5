
package tp5_ejercicio1;


public class Disfraz implements Rentable{
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
       this.dias += periodo;
        System.out.println("Alquilado");
    }

    @Override
    public boolean alquilado() {
        return this.dias > 0;
    }

    @Override
    public void desocupar() {
        this.dias = 0;
        System.out.println("Se desocupo disfraz");
    }
  
}
