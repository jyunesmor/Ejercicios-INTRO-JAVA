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
public class Ejercicio6_JavaExtra_promedioEstaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
       debajo de 1.60 mts. y el promedio de estaturas en general.*/
     
     Scanner leer = new Scanner (System.in);
     
     int personas = 0;
     float sumMEs = 0, sumTo = 0;
     int cGral = 0, c = 0;
    
        System.out.println(" ------------------------------------------- ");
        System.out.print(" Ingrese la Cantidad de Personas a promediar: ");
        personas = leer.nextInt();
        
        IngresoDeMedidas(personas,sumMEs,sumTo,c);
      
    }
    
    public static void IngresoDeMedidas(int personas, float sumMEs, float sumTo, int c){
        
        Scanner leer = new Scanner (System.in);
        float estatura;
        
        for (int i = 0; i < personas; i++) {
            
            System.out.println("Ingrese la estatura de la Primer Persona");
            estatura = leer.nextFloat();
            
            if (estatura < 1.6) {
                 sumMEs = sumMEs + estatura;
                 c = c + 1;
            } 
            sumTo = sumTo + estatura;
            }
        
        float promME;
        float promGral;
        // Calculo de personas Menores de 1.60mts
        promME = sumMEs / c;
        System.out.println(" La cantidad de personas menores de 1.60 Mts es de: " + c + " y su altura Promedio es de: " + promME + " Mts. ");
        // Calculo de personas Totales
        promGral = sumTo / personas;
        System.out.println(" La cantidad de personas ingresadas es de: " + personas + " y su altura Promedio es de: " + promGral + " Mts. ");
    
    }

}
