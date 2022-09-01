/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesJava;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio20_JavaCuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
          suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
          permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
          El programa deberá comprobar que los números introducidos son correctos, es decir,
          están entre el 1 y el 9.*/
     
          Scanner leer = new Scanner(System.in);
          
          int [] [] matriz = new int [3][3];
          
        inicializarMatriz(matriz);
        mostrarMatriz(matriz);
        sumaFilasColumnasDiagonales(matriz);        
        
    }
    // Iniciar y Cargar la Matriz
    public static void inicializarMatriz( int [][] matriz){
               Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = leer.nextInt();
              
                if (num >= 1 && num <= 9) {
                    matriz[i][j] = num;
                } else {
                    System.out.println(" El numero ingresado no es correcto, por favor ingreso un nuemro entre 1 y 9");
                }     
            }
        }
    } 
    // Mostar la Matriz Generada
    public static void mostrarMatriz( int [][] matriz){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("----------");
        System.out.println("  Matriz  ");
        System.out.println("----------");
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + matriz [i][j]);
            }
          System.out.println("");
        }
    }
    // Mostar la Matriz Generada
    public static void sumaFilasColumnasDiagonales( int [][] matriz){
        Scanner leer = new Scanner(System.in);
        int sumf1 = 0; 
        int sumf2 = 0; 
        int sumf3 = 0; 
        for (int j = 0; j < 3; j++) {
              sumf1 = matriz[0][j] + sumf1;
              sumf2 = matriz[1][j] + sumf2;
              sumf3 = matriz[2][j] + sumf3;
        }
        int sumc1 = 0; 
        int sumc2 = 0; 
        int sumc3 = 0;
        for (int i = 0; i < 3; i++) {
              sumc1 = matriz[i][0] + sumc1;
              sumc2 = matriz[i][0] + sumc2;
              sumc3 = matriz[i][0] + sumc3;
        }
        int sumd1 = 0;
        int sumd2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i != j)) {
                    sumd1 = matriz[i][j] + sumd1;
                }
                if (!(i + j != 3-1)) {
                    sumd2 =  matriz[i][j] + sumd2;
                }
            }
        }
        
        if (!(sumf1 != sumf2 && sumf2 != sumf3 && sumf3 != sumc1 && sumc1 != sumc2 && sumc2 != sumc3 && sumc3 != sumd1 && sumd1 != sumd2)) {
            System.out.println(" La Matriz es Magica, todos sus lados suman " + sumf1);
        } else {
            System.out.println(" La Matriz NO es Magica");
        }
        
//        System.out.println(sumf1);
//        System.out.println(sumf2);
//        System.out.println(sumf3);
//        System.out.println(sumc1);
//        System.out.println(sumc2);
//        System.out.println(sumc3);
//        System.out.println(sumd1);
//        System.out.println(sumd1);
    }  
    
}
