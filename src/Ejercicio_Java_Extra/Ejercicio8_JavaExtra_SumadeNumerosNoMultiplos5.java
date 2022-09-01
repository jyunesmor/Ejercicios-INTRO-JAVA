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
public class Ejercicio8_JavaExtra_SumadeNumerosNoMultiplos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
       detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
       la cantidad de números impares. Al igual que en el ejercicio anterior los números
       negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
    
    Scanner leer = new Scanner (System.in);
    
        int sum = 0;
        int n = 0;
        int cPar = 0;
        int cImpar = 0;
        int x = 0;
    
        do 
        {
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        
            if (n % 5 == 0) {
                break;
            }
               sum = sum + n;
               
            if (n % 2 == 0)
            {
                cPar = cPar + 1;
            } 
            else
            {
                cImpar = cImpar + 1;
            }

        } while (n > 0);
        
        System.out.println(" La Cantidad total de números Ingresados es de: " + (cPar + cImpar) + " y su Suma es de: " + sum);
        System.out.println(" La Cantidad de Numeros Pares es de: " + cPar + " y la de números Impares es de: " + cImpar);
        
    
    }
    
}
