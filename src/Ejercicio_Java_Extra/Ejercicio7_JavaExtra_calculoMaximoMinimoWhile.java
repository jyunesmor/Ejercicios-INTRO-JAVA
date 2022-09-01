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
public class Ejercicio7_JavaExtra_calculoMaximoMinimoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
         de n números (n>0). El valor de n se solicitará al principio del programa y los números
         serán introducidos por el usuario. Realice dos versiones del programa, una usando el
         bucle “while” y otra con el bucle “do - while”.*/
    
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese la Cantidad de Números a Sumar");
        int n = leer.nextInt();
        int x = 0;
        int sum = 0;
        int vMin = 10000;
        int vMax = 0;
        float prom;
        
        while (x < n ){
                  System.out.println("Ingrese un número a Sumar");
                  int a = leer.nextInt();
                  sum = sum + a;
                  if (vMax < a) {
                      vMax = a;
                  }
                  if (vMin > a) {
                      vMin = a;
                  }
          x = x + 1;
        } 
            prom = sum / n;
         
            System.out.println(" El Promedio de los " + n + "numeros Ingresados es de: " + prom);
            System.out.println(" El Valor Máximo Ingresado es de: " + vMax);
            System.out.println(" El Valor Mínimo Ingresado es de: " + vMin);
    }
    
}
