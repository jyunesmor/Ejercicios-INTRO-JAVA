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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
    
    Scanner leer = new Scanner  (System.in);

        System.out.println(" Ingrese el dividendo");
        int a = leer.nextInt();
        System.out.println("");
        System.out.println(" Ingrese el divisor");
        int b = leer.nextInt();
        System.out.println("");
    
        int resta = 0;
        int contDiv = 1; 
        
        resta = a-b;
        
        do {
            
            resta = resta - b;
            contDiv = contDiv + 1;
   
        } while (resta > b);
        
        System.out.println(" El Residuo de la resta es : " + resta);
        System.out.println(" El Cociente de la resta es : " + contDiv);         
        
    }
    
}
