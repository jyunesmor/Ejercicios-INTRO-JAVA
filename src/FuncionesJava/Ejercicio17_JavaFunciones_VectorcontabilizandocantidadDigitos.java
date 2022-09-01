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
public class Ejercicio17_JavaFunciones_VectorcontabilizandocantidadDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
          de 2 dígitos, etcétera (hasta 5 dígitos).*/
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del Vector ");
        int n = leer.nextInt();

        int[] vector = new int[n];

        inicializarVector(vector, n);
        validarVector(vector, n);
    }

    public static void inicializarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i] + " se encuentra en la posicion :" + i);
        }
    }
    public static void validarVector(int[] vector, int n) {
        
        int contUn = 0;
        int contDec = 0;
        int contCen = 0;
        int contUnmil = 0;
        int contDecmil = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] >= 1 && vector[i] <= 9 ) {
                contUn = contUn + 1;
            }
            if (vector[i] >= 10 && vector[i] <= 99 ) {
                contDec = contDec + 1;
            }  
            if (vector[i] >= 100 && vector[i] <= 999 ) {
                contCen = contCen + 1;
            }
            if (vector[i] >= 1000 && vector[i] <= 9999 ) {
                contUnmil = contUnmil + 1;
            }
            if (vector[i] >= 10000 && vector[i] <= 99999 ) {
                contDecmil = contDecmil + 1;
            }
        }
        
        System.out.println(" La Cantidad de Numeros generados de 1 Digito es: " + contUn);
        System.out.println(" La Cantidad de Numeros generados de 2 Digitos es: " + contDec);
        System.out.println(" La Cantidad de Numeros generados de 3 Digitos es: " + contCen);
        System.out.println(" La Cantidad de Numeros generados de 4 Digitos es: " + contUnmil);
        System.out.println(" La Cantidad de Numeros generados de 5 Digitos es: " + contDecmil);
    }
}
    

