/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio.pkg2;

import java.util.Comparator;

/**
 *
 * @author USUARIO
 */
public class CompararAntiguedad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Empleado e1 = (Empleado)o1;
        Empleado e2 = (Empleado)o2;
        
        if(e1.getAnio() == e2.getAnio())return 0;
        else if( e1.getAnio() < e2.getAnio())return -1;
             else return 1; 
    }
}
