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
public class Ejercicio19_JavaExtra_difernciaentre2Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).*/
    
        Scanner leer = new Scanner (System.in);
    
        System.out.println(" Ingrese el Tamaño de los Vectores ");
        int n = leer.nextInt();
        
        int [] vectorA = new int [n];   
        int [] vectorB = new int [n];  
        
        for (int i = 0; i < n; i++) {
            vectorA[i]=0;
            vectorB[i]=0;
        }
      
        for (int i = 0; i < n; i++) {
            System.out.println(" Ingreso los valores del Vector A ");
            vectorA[i]= leer.nextInt();
        }
       
        for (int i = 0; i < n; i++) {
             System.out.println(" Ingreso los valores del Vector B "); 
            vectorB[i]= leer.nextInt();
        }       
        for (int i = 0; i < n; i++) {
            System.out.print("| " + vectorA[i] + " |"); 
        }
            System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("| " +vectorB[i] + " |"); 
        }
            System.out.println("");
        for (int i = 0; i < n; i++) {
            if (vectorA[i] ==  vectorB[i]) {
               System.out.println(" Los números son coincidentes");
            } else {
               System.out.println(" En la Posición " + (i+1) + " los números no son coincidentes");
            }
        }       
               
    }
    
}
