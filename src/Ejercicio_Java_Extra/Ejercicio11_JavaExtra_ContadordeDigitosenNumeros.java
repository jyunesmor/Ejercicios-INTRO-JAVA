package Ejercicio_Java_Extra;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Ejercicio11_JavaExtra_ContadordeDigitosenNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.*/
    
        Scanner leer = new Scanner (System.in);
            
        System.out.println(" Ingrese un numero a contabilizar sus digitos");
        int n = leer.nextInt();
      
        int c = 1;
        int nF = n /10;
        
        while (nF != 0)
        {
            nF = nF /10;
            c = c + 1;
        }
        
        System.out.println(" La Cantidad de Digitos que tiene este numero es de: " + c);
        
               
//        // Obtener Unidad
//        int u = n % 10;
//        // Obtener Decena
//        int d = n % 100;
//        int dA = d / 10;
//        // Obtener Centena
//        int c = n /100;
//        int cA = c % 10;        
//        // Obtener Unidad de Mil
//        int um = n /1000;
//        int umA = um % 10;
//        // Obtener decena de Mil
//        int dm = n /10000;
//        
//        System.out.println(u);
//        System.out.println(dA);
//        System.out.println(cA);
//        System.out.println(umA);
//        System.out.println(dm);
    
    
    }
    
}
