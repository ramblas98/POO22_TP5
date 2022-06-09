/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5.ejercicio.pkg3;

/**
 *
 * @author USUARIO
 */
public class TP5EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    
   /*Ejercicio 3. Crea una interfaz Hablador con el método void saluda(). 
    A continuación, crea dos clases abstractas Animal y Persona con atributos 
    adecuados y los métodos correspondientes para acceder a estos atributos. 
    Posteriormente, crea las subclases Perro y Gato que heredan de Animal e 
    implementan un saludo asociado. Por último, crea una subclase de Persona,
    por ejemplo Programador, que a su vez también tenga su implementación 
    del método saluda. Dibuje el diagrama de clases e interfaces 
    correspondiente.*/

    public static void main(String[] args) {
        // TODO code application logic here
        Animal lista[] = new Animal[2];
        
        lista[0] = new Perro("Huski","Macho",1);
        lista[1] = new Gato("Persa","Hembra",2);
        
        for (Animal i : lista) {
            if(i instanceof Perro m){
                System.out.println(m.getRaza());
                m.saluda();
            }
            if(i instanceof Gato n){
                System.out.println(n.getRaza());
                n.saluda();
            }
            
        }
        
    }
    
}
