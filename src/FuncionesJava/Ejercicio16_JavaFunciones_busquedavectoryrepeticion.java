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
public class Ejercicio16_JavaFunciones_busquedavectoryrepeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
          usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
          numero y si se encuentra repetido*/
    
        Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese el tamaño del Vector ");
        int n = leer.nextInt();

        int[] vector = new int[n];

        inicializarVector(vector, n);
        bucarymostrarValor(vector, n);
    }

    public static void inicializarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*10);
            System.out.println(vector[i]+" se encuentra en la posicion :" + i);
            System.out.println("");
        }
    }

    public static void bucarymostrarValor(int[] vector, int n) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el numero a encontrar");
        System.out.println("");
        int num = leer.nextInt();
        int contNum = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (!(vector[i] != num)){
                System.out.println("El Valor "+num+" se encuentra en la Posicion " + i);
                contNum = contNum + 1;
            }
        }
        System.out.println("");
        System.out.println("La cantidad de Veces que se encuentra "+num+" es de: "+contNum+" veces");
    }
}
