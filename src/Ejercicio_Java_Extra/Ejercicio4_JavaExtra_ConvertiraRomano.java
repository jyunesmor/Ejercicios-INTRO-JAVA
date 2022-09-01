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
public class Ejercicio4_JavaExtra_ConvertiraRomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/

        Scanner leer = new Scanner(System.in);

        boolean flag = false;
        
        int n;
        do {
            System.out.println("--------------------------------------------");
            System.out.print("Ingrese el Número entre 1 y 9, desea convertir en Romano: ");
            n = leer.nextInt();
            
            switch (n) {
                case 1:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: I ");
                    break;
                case 2:
                    System.out.println("El número " + n + "que ingreso, convertido a número Romano es: II ");
                    break;
                case 3:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: III ");
                    break;
                case 4:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: IV ");
                    break;
                case 5:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: V ");
                    break;
                case 6:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: VI ");
                    break;
                case 7:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: VII ");
                    break;
                case 8:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: VIII ");
                    break;
                case 9:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: IX ");
                    break;
                case 10:
                    System.out.println("El número " + n + " que ingreso, convertido a número Romano es: X ");
                    break;
                default:
                    System.out.println("El número ingresado es incorrecto, Ingrese nuevamente");
                   
            }

        } while (n<1 || n>10);
    
 
    }

}
