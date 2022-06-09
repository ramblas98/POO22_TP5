/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5.ejercicio.pkg2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class TP5EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] lista = new Empleado[3]; 
        
        LocalDate fechaNacimientoa = LocalDate.of(1999, 3, 27); 
        lista[0] = new Empleado("Martinez","Daniel",fechaNacimientoa,41829826,2022);
        
        LocalDate fechaNacimientob = LocalDate.of(1998, 2, 17);
        lista[1] = new Empleado("Suarez","Angel",fechaNacimientob,41829826,2022);

        LocalDate fechaNacimientoc = LocalDate.of(2000, 4, 10); 
        lista[2] = new Empleado("Gomes","Gaston",fechaNacimientoc,41829826,2022);
        
        Arrays.sort(lista);
        
        for (Empleado lista1 : lista) {
            System.out.println(lista1.toString());
        }
    }
    
}
