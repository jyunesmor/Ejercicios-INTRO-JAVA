/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesJava;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Juan
 */
public class Ejercicio15_JavaFunciones_1eros100numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//  muestre por pantalla en orden descendente.

        int[] vector = new int[100];
        
        inicializarVector(vector);
        mostrarVector(vector);
    }

    public static void inicializarVector(int[] vector) {
        int cont = 0;
        for (int i = 99; i >= 0; i--) {
            vector[cont] = i;
            cont++;
        }
    }

    public static void mostrarVector(int[] vector) {

        System.out.println(" Los 100 primeros Numeros enteros en forma descendientes son: ");
        for (int i = 0; i <= 99; i++) {
            System.out.println(vector[i]);
        }
    }
}
