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
public class Ejercicio15_JavaExtra_OperacionesenFuncion {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.*/
    
    Scanner leer = new Scanner(System.in);
             
               System.out.println("");
               System.out.println("Ingrese un Valor");
               int num1 = leer.nextInt();
               System.out.println("");
               System.out.println("Ingrese un nuevo Valor");
               int num2 = leer.nextInt();
               System.out.println("");
               int option1 = 0;
               
            do {   
               System.out.println("Ingrese Opcion a Realizar");
               System.out.println("1. Sumar");
               System.out.println("2. Restar");
               System.out.println("3. Multiplicar");
               System.out.println("4. Dividir");
               System.out.println("5. Salir");
               int  option = leer.nextInt();
               leer.nextLine();
               
               switch (option) {
                   case 1:
                       suma(num1,num2);
                       System.out.println(" La Suma de los números ingresado es: " + suma(num1,num2)); 
                       break;
                   case 2:
                       resta(num1,num2);
                       System.out.println(" La Suma de los números ingresado es: " + resta(num1,num2)); 
                       break;
                   case 3:
                       multi(num1,num2);
                       System.out.println(" La Suma de los números ingresado es: " + multi(num1,num2)); 
                       break;
                    case 4:
                       div(num1,num2);
                       System.out.println(" La Suma de los números ingresado es: " + div(num1,num2)); 
                       break;
                    case 5:
                       System.out.println(" Usted esta por Salir, ¿Desea Hacerlo? ");   
                       String a = leer.nextLine();
                       a = a.toUpperCase();
                        if (a.equals("S")){
                            System.out.println("usted Decidio Salir, Muchas Gracias".toUpperCase());
                            option1 = 5;
                        } else {
                            option1 = 4;
                        }
                        break;
                    default:
                        System.out.println(" Ninguna de las Opciones es Correcta, ¿Ingrese nuevamente? "); 
                    }
    
                } while(option1 != 5);
    }
    
    public static int suma(int num1, int num2)
    {
        int suma = 0;
        suma = num1 + num2;
        return suma;
    }
    
        public static int resta(int num1, int num2)
    {
        int resta = 0;
        resta = num1 - num2;
        return resta;
    }
    
        public static int multi(int num1, int num2)
    {
        int multi = 0;
        multi = num1 * num2;
        return multi;
    }
        
        public static int div(int num1, int num2)
    {
        int div = 0;
        div = num1 / num2;
        return div;
    }    
        
    
}
