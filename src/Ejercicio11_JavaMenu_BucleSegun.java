
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
public class Ejercicio11_JavaMenu_BucleSegun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  Realizar un programa que pida dos números enteros positivos por teclado y muestre por
         pantalla el siguiente menú:
            MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
            Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.*/
     
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
                       int suma = num1 + num2;
                       System.out.println(" La Suma de los Valores ingresados es igual a: " + suma);   
                       System.out.println("");
                       break;
                   case 2:
                       int resta = num1 - num2;
                       System.out.println(" La Resta de los Valores ingresados es igual a: " + resta);   
                       System.out.println("");
                       break;
                   case 3:
                       int multi = num1 * num2;
                       System.out.println(" La Multiplicación de los Valores ingresados es igual a: " + multi);   
                       System.out.println("");
                       break;
                    case 4:
                       float div = num1 / num2;
                       System.out.println(" La División de los Valores ingresados es igual a: " + div);   
                       System.out.println("");
                       break;
                    case 5:
                       System.out.println(" Usted esta por Salir, ¿Desea Hacerlo? ");   
                       String a = leer.nextLine();
                       a = a.toUpperCase();
//                       System.out.println(a);
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
}
