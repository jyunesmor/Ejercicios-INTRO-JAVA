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
public class Ejercicio18_JavaExtra_SumadeVectorconVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario. */
    
        Scanner leer = new Scanner (System.in);
        
        System.out.println(" Ingrese el Tamaño del Vector A");
        int n = leer.nextInt();
        
        int [] vectorA = new int [n]; 
         int [] suma = new int [n];
       
         
        // Llenar Vector A  
        for (int i = 0; i < n; i++) {
            vectorA[i]= (int)(Math.random()*100+1);
        }
        // Mostrar vector A        
        for (int i = 0; i < n; i++) {
            System.out.println(" El número del vector en " +(i+1) + " es igual a: " + vectorA[i]);
        }
        // Inicializar Vector suma 
        for (int i = 0; i < n; i++) {
            suma[i] = 0;
        }
        // Llenar Vector suma 
        int x = 0;
        for (int i = 0; i < n; i++) {
            suma[x] = vectorA[i]+ n;
            x++;
        }
        // Mostrar vector suma 
        for (int i = 0; i < n; i++) {
            System.out.println(" La Suma del Vector A " + vectorA[i] + " y " + n + " es: " + suma[i]);
        }

    }
    
}
