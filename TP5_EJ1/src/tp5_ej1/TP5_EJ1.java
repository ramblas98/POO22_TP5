/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej1;

import java.util.Arrays;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author profeblas
 */
public class TP5_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio de Interface
        Disfraz lista[] = new Disfraz[3];
        lista[0] = new Disfraz("Tribilin",'s',2,3000);
        lista[1] = new Disfraz("Pluto",'m',1,1000);
        lista[2] = new Disfraz("Mickey",'l',3,2000);
        
        Arrays.sort(lista);
        System.out.println("Orden Natural");
        for(int i=0;i<3;i++){
            System.out.println(lista[i].toString());
        }
        System.out.println("");
        Arrays.sort(lista,new ComparaDisfrazPrecio());
        System.out.println("Orden por precio");
        for(int i=0;i<3;i++){
            System.out.println(lista[i].toString());
        }
        
        LocalDate f1 = LocalDate.of(1978,01,30);
        LocalDate f2 = LocalDate.now();
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        Period p = Period.between(f1, f2);
        System.out.println(p.toString());
        //edad
        System.out.println(p.getYears());
        
    }
    
}
