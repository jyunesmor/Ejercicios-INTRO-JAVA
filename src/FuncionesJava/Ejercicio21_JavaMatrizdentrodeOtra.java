/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesJava;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio21_JavaMatrizdentrodeOtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.  */
     
        Scanner leer = new Scanner (System.in);
        
//        int [][] matrizA = new int [10][10];
//        int [][] matrizB = new int [3][3];
     
        int [][] matrizA = {{1,26,36,47,5,6,72,81,95,10},
                             {11,12,13,21,41,22,67,20,10,61},
                              {56,78,87,90,9,90,17,12,87,67},
                             {41,87,24,56,97,74,87,42,64,35},
                               {32,76,79,1,36,5,67,96,12,11},
                             {99,13,54,88,89,90,75,12,41,76},
                             {67,78,87,45,14,22,26,42,56,78},
                             {98,45,34,23,32,56,74,16,19,18},
                             {24,67,97,46,87,13,67,89,93,24},
                             {21,68,78,98,90,7,12,41,65,12}};
        int [][] matrizB =  {{56,74,16},
                                {13,67,89},
                                {7,12,41}};
        int  [][] matrizP = new int [3][3];

//      inicializarMatriz(matrizA,matrizB);
        mostrarMatrices(matrizA,matrizB);
        obtencionSubmatrizP(matrizA,matrizB,matrizP);
        ValidarMatrizBconSubmatriz(matrizA,matrizB,matrizP);
    }
//    public static void inicializarMatriz(Integer [][] matrizA,Integer [][] matrizB) {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("-----------------------");
//        System.out.println("Matriz Original 10 X 10");
//        System.out.println("-----------------------");
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("Ingrese Valor");
//                matrizA[i][j] = leer.nextInt();
//            }
//        }
//        System.out.println("-----------------------");
//        System.out.println("Matriz Original 3 X 3");
//        System.out.println("-----------------------");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Ingrese Valor");
//                matrizB[i][j] = leer.nextInt();
//            }
//        }
//    }
    public static void mostrarMatrices(int [][] matrizA,int [][] matrizB) {
        System.out.println("-----------------------");
        System.out.println("Matriz Original 10 X 10");
        System.out.println("-----------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" | " + matrizA[i][j]);
             }
        System.out.println(" |");
        }
        System.out.println("-----------------------");
        System.out.println("Matriz Original 3 X 3");
        System.out.println("-----------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | "+ matrizB[i][j]);
            }
        System.out.println(" |");
        }
    }
    public static void obtencionSubmatrizP(int [][] matrizA,int [][] matrizB, int matrizP [][]) {
            int pos_i = 0;
            int pos_j = 0;

       // obtener posiciones de I, y J
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizA[i][j] == matrizB[0][0]) {
                      pos_i = i;
                      pos_j = j;
                }
            }
        }
          System.out.println(" Posicion en i " + pos_i);
          System.out.println(" Posicion en j " + pos_j);
      
        // Obtener Sub MatrizP   
        for (int i = pos_i; i < pos_i + 3; i++) {
            for (int j = pos_j; j < pos_j + 3; j++) {
                int x = i - pos_i;
                int y = j - pos_j;  
                matrizP[x][y] = matrizA[i][j];
            }
        }
        // Mostrar Sub MatrizP
        System.out.println("Sub Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | "+ matrizP[i][j]);
            }
        System.out.println(" |");
        }
    }
    public static void ValidarMatrizBconSubmatriz(int [][] matrizA,int [][] matrizB, int matrizP [][]) {
        
        int contRep = 0;
        System.out.println("Sub Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( matrizB[i][j] ==  matrizP[i][j]) {
                    contRep = contRep + 1;
                } else {
                    contRep = 0;
                }
            }
        }
        if (contRep == 3*3) {
            System.out.println(" La Matriz B se encuentra en la Matriz A");
        } else {
            System.out.println(" La Matriz B no se encuentra dentro de la Matriz A");
        }
    }
}
  
 
