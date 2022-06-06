/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej1;

import java.util.Arrays;

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
        Disfraz lista[] = new Disfraz[100];
        lista[0] = new Disfraz("Tribilin",'s',2,2000);
        lista[1] = new Disfraz("Pluto",'m',1,1000);
        lista[2] = new Disfraz("Mickey",'l',3,2000);
        
        Arrays.sort(lista,0,2);
        System.out.println("Orden Natural");
        for(int i=0;i<3;i++){
            System.out.println(lista[i].toString());
        }
        System.out.println("");
        Arrays.sort(lista, 0,2,new ComparaDisfrazPrecio());
        System.out.println("Orden por precio");
        for(int i=0;i<3;i++){
            System.out.println(lista[i].toString());
        }
    }
    
}
