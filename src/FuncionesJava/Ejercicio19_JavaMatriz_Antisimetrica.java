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
public class Ejercicio19_JavaMatriz_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la Matriz ");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];

        inicializarMatriz(matriz,n);   // Inicialización
             System.out.println("");
             System.out.println("");
        matrizTranspuesta(matriz,n);
             System.out.println("");
             System.out.println("");
        matrizTranspuestainvertida(matriz,n); 
             System.out.println("");
             System.out.println("");
        matrizAntisimetrica(matriz,n);  // Verificación
    }

    public static void inicializarMatriz(int[][] matriz, int n) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Matriz Original");
        System.out.println("---------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese Valor");
                matriz[i][j] = leer.nextInt();
            }
          System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + matriz[i][j]);
            }
          System.out.println("");
        }
    }
    public static void matrizTranspuesta(int[][] matriz, int n) {
        System.out.println("------------------");
        System.out.println("Matriz Transpuesta");
        System.out.println("------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  System.out.print("  " + matriz[j][i]);
            }
            System.out.println("");
        }
    }
    public static void matrizTranspuestainvertida(int[][] matriz, int n) {
        System.out.println("--------------------------");
        System.out.println("Matriz Transpuesta Inversa");
        System.out.println("--------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
             matriz[j][i] = -matriz[j][i]; 
              System.out.print("  " + matriz[j][i]);
            }
            System.out.println("");
        }
    }     
    public static void matrizAntisimetrica(int[][] matriz, int n) {
       
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == - matriz[j][i]) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
          if (flag == true) {
              System.out.println(" La Matriz es Antisimetrica");
          } else {
              System.out.println(" La Matriz No es Antisimetrica");
          }
    } 
}
    

