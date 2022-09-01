
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
public class Ejercicio4_JavaGrados_Celsius_to_Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
     
                Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese los grados Centigrados a Convertir");
        float grad_cel = leer.nextFloat();
        
        float grad_far = 32 + (9*grad_cel/5);
      
        System.out.println("Los grados Fahrenheit correspondientes a: " + grad_cel + "°C, es de: "  + grad_far + "°F");
        
    }
    
}
