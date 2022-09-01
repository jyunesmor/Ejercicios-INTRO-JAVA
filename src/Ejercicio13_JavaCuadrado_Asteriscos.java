
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
public class Ejercicio13_JavaCuadrado_Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
         cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
            * * * *
            *     *
            * * * * 
      */
      
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese el Lado del Cuadrado");
       int num = leer.nextInt();
               
       
       for (int i = 1 ; i <= num ; i ++) {
         for (int j = 1 ; j <= num ; j ++) {
             
            if (i > 1 && i < num && j > 1 && j < num){
                 System.out.print("   ");
             } else {
                 System.out.print("  *");
             }
            }
         System.out.println(" ");
        }
    }
}
