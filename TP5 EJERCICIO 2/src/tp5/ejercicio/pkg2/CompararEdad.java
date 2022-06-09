/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio.pkg2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class CompararEdad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Empleado e1 = (Empleado)o1;
        Empleado e2 = (Empleado)o2;
        
        Date date = new Date();
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
        
        int e1Edad = getLocalDate.getYear() - e1.getFechaNacimiento().getYear();
        int e2Edad = getLocalDate.getYear() - e2.getFechaNacimiento().getYear();
        
        if(e1Edad == e2Edad)return 0;
        else if (e1Edad < e2Edad)return -1;
             else return 1;
    }
    
}
