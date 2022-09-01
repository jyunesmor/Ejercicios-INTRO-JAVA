
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
public class Ejercicio5_Java_mostraDob_Tri_cuadra_nroEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
       doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el Valor a Calcular");
        int num = leer.nextInt();
        /* Calculo de Datos */
        int doble = num*2;
        int triple = num*3;
        double r_cuadrada = Math.sqrt(num);
        /* Mostrar Todos los Calculos*/
        System.out.println("");
        System.out.println("El Doble de " + num + " es: " + doble);
        System.out.println("");
        System.out.println("El Tiple de " + num + " es: " + triple);
        System.out.println("");
        System.out.println("La Raiz Cuadrada de " + num + " es: " + r_cuadrada);
        System.out.println("");
    }
}
