/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Java_Extra;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio10_JavaExtra_MultiplicacionAdivinar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*  Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java. */
    
        Scanner leer = new Scanner (System.in);
        
        System.out.println(" ----------------------- ");
        System.out.println(" Adivinar Multiplicación ");
        System.out.println(" ----------------------- ");
        
        int n1 = (int) (Math.random()*10);
        int n2 = (int) (Math.random()*10);
    
        System.out.println(n1);
        System.out.println(n2);
        
        int multi = n1 * n2; 
        
        int resp = 0;
        boolean flag = false;
       
        do 
        {
        System.out.println(" Ingrese cual es el Resultado obtenido");
        resp = leer.nextInt();
        
             if (multi == resp) {
                  System.out.println(" El Resultdo Ingresado es el Valor Obtenido");
                 System.out.println(" Su respuesta es: " + resp + " el resultado de la multiplicacion de: " + n1 + " y " + n2 + " es de: " + multi);
                 flag = true;
             } else {
                 System.out.println(" El Resultado ingresado no es correcto, Ingrese otro valor");
                 flag = false;
            }
        } while (flag != true);
    }
    
}
