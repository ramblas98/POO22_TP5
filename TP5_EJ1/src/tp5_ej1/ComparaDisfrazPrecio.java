/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej1;

import java.util.Comparator;

/**
 *
 * @author profeblas
 */
public class ComparaDisfrazPrecio implements Comparator{

    @Override
    public int compare(Object t1, Object t2) {
        Disfraz d1 = (Disfraz) t1;
        Disfraz d2 = (Disfraz) t2;
        if (d1.getPrecio()==d2.getPrecio())
            return 0;
        else
            if (d1.getPrecio()<d2.getPrecio())
                return -1;
            else
                return 1;
    }
    
    
}
