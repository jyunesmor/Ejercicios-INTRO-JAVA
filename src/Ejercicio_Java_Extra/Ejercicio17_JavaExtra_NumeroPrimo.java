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
public class Ejercicio17_JavaExtra_NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*  Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        ¿Qué son los números primos?
        Básicamente, un número primo es un número natural que tiene solo dos divisores o
        factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
        uno y por el mismo número.
        El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos */
    
        Scanner leer = new Scanner (System.in);
  
            System.out.println("");
            System.out.print("Ingrese un Valor ");
            int n = leer.nextInt();
                  
            boolean resultado = validacion(n);
        
            System.out.println(" El Valor Ingresado es Primo ? " + resultado);
    
    }
    
    public static boolean validacion(int n) {
     
        boolean primo = false;
        int cont = 0;
        
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
               cont = cont + 1; 
            }
        }
        System.out.println(" Cantidad de Números Divisibles " + cont);
        
        if (cont == 2)
        {
            primo = true;
        } 

        return primo;
    }
    
}
