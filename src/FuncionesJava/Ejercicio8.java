/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesJava;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
    
    
        Scanner leer = new Scanner (System.in);
    
        int n = 0;
        int cPar = 0;
        int cImpar = 0;
        int sum = 0;
       
        do {
    
            System.out.println(" Ingrese Un número entero positivo");
            n = leer.nextInt();
            if (n < 0) {
              continue;
            }
            if (n % 2 == 0) {
                cPar = cPar +1;
            } else {
                cImpar = cImpar +1;
            }
            sum = sum + n;      
        } while (!(n % 5 == 0));
        
           System.out.println(" Los Numeros Ingresados son " + (cPar + cImpar));
           System.out.println(" Los Numeros Pares Ingresados son " + cPar );
           System.out.println(" Los Numeros Impares Ingresados son " + cImpar );     
           System.out.println(" La Suma de todos los Numeros Ingresados es " + sum );
    
    }
    
}
