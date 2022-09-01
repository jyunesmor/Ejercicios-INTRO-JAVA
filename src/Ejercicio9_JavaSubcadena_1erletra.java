
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
public class Ejercicio9_JavaSubcadena_1erletra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la Palabra ");
        System.out.println("");
        String palabra = leer.nextLine();
        
        String letra = palabra.substring(0,1);
    
//        System.out.println(letra);
        
        if (letra.equals("A")){
            System.out.println(" Correcto");
        } else {
            System.out.println(" Incorrecto");
        } 
    }
    
}
