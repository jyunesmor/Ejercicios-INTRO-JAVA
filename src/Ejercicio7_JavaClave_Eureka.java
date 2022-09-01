
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
public class Ejercicio7_JavaClave_Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese la Palabra Clave");
        System.out.println("");
        String clave = leer.nextLine();
        
        if (clave.equals("Eureka")){
            System.out.println(" Correcto");
        } else {
            System.out.println(" Incorrecto");
        } 
    }
}
