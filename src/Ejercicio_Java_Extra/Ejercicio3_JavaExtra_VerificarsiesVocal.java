/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Java_Extra;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio3_JavaExtra_VerificarsiesVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
          Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */
  
          Scanner  leer = new Scanner (System.in);
          
          System.out.print("Ingrese un Letra: ");
          String letra = leer.nextLine();
          
          if ( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
              System.out.println("La Letra " + letra.toUpperCase() + " es una Vocal");
        } else {
              System.out.println("La Letra " + letra.toUpperCase() + " no es una Vocal");
          }
    }
}
