
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
public class Ejercicio10_JavaSuma_hastanumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
         números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
     
             Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el Numero Limite ");
        int num_lim = leer.nextInt();
    
        int suma = 0;
        int i = 0;
        int num1;
        do {
            System.out.println("Ingrese un Valor");
            num1 = leer.nextInt();
            suma = suma + num1;
            i = i + 1;
            System.out.println("Valor ingresado "+ i + " es " + num1);
        } while(suma < num_lim);
        
        System.out.println(" La Suma de los Valores Ingresados es de: " + suma + " es mayor a el limite ingresado " + num_lim);
   
        
    }
    
}
