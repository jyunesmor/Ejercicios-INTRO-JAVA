package Ejercicio_Java_Extra;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Ejercicio12_JavaExtra_InterccambiodenumeroporE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 
        0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
                0-0-0
                0-0-1
                0-0-2
                0-0-E
                0-0-4
                0-1-2
                0-1-E
         Nota: investigar función equals() y como convertir números a String. */

        Scanner leer = new Scanner(System.in);

        int z = 0;
        int x = 0;
        int c = 0;
        int e = 69;
        do {
            do {
                do { 
                    if (c == 3) {
                        System.out.println(z + " - " + x + " - " + (char) e);
                   } else {
                      System.out.println(z + " - " + x + " - " + c); 
                   }   
                c++;    
                } while (c <= 9);
                     if (c == 3) {
                        System.out.println(z + " - " + x + " - " + (char) e);
                   } else {
                      System.out.println(z + " - " + x + " - " + c); 
                   }
                    c = 0;
                    x++;  
            } while (x <= 9);
         
            c = 0;
            x = 0;
            z++;
        } while (z <= 9);

    }

}
