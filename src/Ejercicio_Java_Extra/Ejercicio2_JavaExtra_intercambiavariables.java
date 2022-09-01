/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Java_Extra;

/**
 *
 * @author Juan
 */
public class Ejercicio2_JavaExtra_intercambiavariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
          una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
          tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
          iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
       /* b = c
          c = a  
          a = d
          d = b      */ 
       
       int a = 8, b = 4, c = 10, d = 1;
       int auxA, auxB;
                
        System.out.println("------------------");
        System.out.println("Valores Originales");
        System.out.println("------------------");
        System.out.println("El Valor Original de A es: " + a);
        System.out.println("El Valor Original de B es: " + b);
        System.out.println("El Valor Original de C es: " + c);
        System.out.println("El Valor Original de D es: " + d);
        System.out.println("");
        
        auxA= a;
        auxB= b;
        a = d;
        b = c;
        c = auxA;
        d = auxB;
                
        System.out.println("----------------------");
        System.out.println("Valores Intercambiados");
        System.out.println("----------------------");
        System.out.println("El Valor Original de A es: " + a);
        System.out.println("El Valor Original de B es: " + b);
        System.out.println("El Valor Original de C es: " + c);
        System.out.println("El Valor Original de D es: " + d);
    }
    
}
