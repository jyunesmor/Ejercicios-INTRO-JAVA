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
public class Ejercicio9_JavaExtra_RestasSucesivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
    
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el Divisor: ");
        int n = leer.nextInt();
    
        System.out.print("Ingrese el Dividendo: ");
        int n1 = leer.nextInt();    
        
        int restaFinal = 0;
        int cont = 1;
        
            restaFinal = n - n1;
            
        while (restaFinal > n1)
        {
            restaFinal = restaFinal - n1;  
            cont = cont + 1;
        }
            
        System.out.println(" El residuo de la Division es de: " + restaFinal + " y el Cociente de: " + cont);
    }
    
}
