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
public class Ejercicio1_JavaExtra_CalculoDiasHorasporMinutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
         usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
      
      Scanner leer = new Scanner (System.in);
      
        System.out.println("----------------------------------------");
        System.out.println(("Conversion de Segundos en Dias, y Horas").toUpperCase()) ;
        System.out.println("----------------------------------------");
        System.out.println("");
      
        System.out.print("Ingrese los Segundos a convertir: ");
        int min = leer.nextInt();
          
        convertirMinutos(min);
      
    }
    
    public static void convertirMinutos(int min){
    
        // 1 hora son 60 minutos
        // 24hs es 1 dia 
       
        int dias = 0;
        int horas = 0;
        
        horas = min / 60;
     
    do {    
        if (horas > 24) {
            horas = horas - 24;
            dias = dias + 1;
            System.out.println(horas);
        } else {
            horas = horas;
        }
    } while (horas > 24);   
    
        if (horas > 1) {
           System.out.println("Los Minutos ingresados " + min + " Minutos, son " + dias + " Dias, y " + horas + " Horas");
        } else {
           System.out.println("Los Minutos ingresados " + min + " Minutos, son " + dias + " Dia, y " + horas + " Horas");
        }
    }     
}
