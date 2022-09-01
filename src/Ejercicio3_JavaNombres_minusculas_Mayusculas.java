
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
public class Ejercicio3_JavaNombres_minusculas_Mayusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Frase1;
        String Frase2;
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese La Frase en Mayusculas");
        System.out.println("");
        Frase1 = leer.nextLine();
        System.out.println("");
        System.out.println(" Ingrese La Frase en Minusculas");
        System.out.println("");
        Frase2 = leer.nextLine();
        System.out.println(""); 
        System.out.println(" La Frase 1 en Minusculas es: " + Frase1.toLowerCase()); 
        System.out.println("");
        System.out.println(" La Frase 2 en Mayusculas es: " + Frase2.toUpperCase()); 
        System.out.println("");
    }
}
