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
public class Ejercicio18_JavaFunciones_matrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del Vector ");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];

        inicializarVector(matriz, n);
         System.out.println("");
         System.out.println("");
        validarVector(matriz, n);
    }
    public static void inicializarVector(int[][] matriz, int n) {
            System.out.println("---------------");
            System.out.println("Matriz Original");
            System.out.println("---------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 1000);
                System.out.print( "  " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
    public static void validarVector(int[][] matriz, int n) {
            System.out.println("------------------");
            System.out.println("Matriz Transpuesta");
            System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print( "  " + matriz[j][i]);
            }
            System.out.println("");
        }
        
    }
}
        
        
    
        

