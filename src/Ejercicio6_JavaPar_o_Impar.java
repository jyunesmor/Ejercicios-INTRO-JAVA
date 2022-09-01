
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
public class Ejercicio6_JavaPar_o_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a validar");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("el Numero " + num + " es PAR" );
        } else {
            System.out.println("el Numero " + num + " es IMPAR");
        }
       
    }
}
