
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
public class Ejercicio1_JavaSuma_de_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer Valor");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo Valor");
        int num2 = leer.nextInt(); 
        
        int suma = num1 + num2;
        
        System.out.println("La Suma de los Valores Ingresados es: " + suma);
    }
}