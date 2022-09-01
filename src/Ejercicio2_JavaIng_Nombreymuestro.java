
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
public class Ejercicio2_JavaIng_Nombreymuestro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese su Nombre");
        System.out.println("");
        String nombre = leer.nextLine();
        
        System.out.println(""); 
        System.out.println(" Su Nombre es: " + nombre); 
        System.out.println("");
    }
}