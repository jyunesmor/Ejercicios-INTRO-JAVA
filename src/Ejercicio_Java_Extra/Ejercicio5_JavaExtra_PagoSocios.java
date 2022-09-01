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
public class Ejercicio5_JavaExtra_PagoSocios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*  Una obra social tiene tres clases de socios:
            o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
                todos los tipos de tratamientos.
            o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
                los mismos tratamientos que los socios del tipo A.
            o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
                tratamientos.
            # Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
            real que represente el costo del tratamiento (previo al descuento) y determine el
            importe en efectivo a pagar por dicho socio. */ 
    
            Scanner leer = new Scanner (System.in);
            
        System.out.println("--------------------------");
        System.out.println("Calculo de Importe a Pagar");
        System.out.println("--------------------------"); 
        System.out.println("");
        System.out.print("Ingrese Importe del Tratamiento: $ ");
        float importe = leer.nextFloat();
        System.out.println("");
          
        int valor = 0;
        String plan;
        do {
            
          System.out.print("Ingrese el Plan del Afiliado: ");
          plan = leer.nextLine();
          plan = plan.toUpperCase();
    
            switch (plan) {
                case "A":
                    valor = (int) (importe * 0.5);
                    System.out.println("El Importe Final a Abonar por el Asociado es de: $ " + valor + ".- ");
                    break;
                case "B":
                    valor = (int) (importe * 0.35);
                    System.out.println("El Importe Final a Abonar por el Asociado es de: $ " + valor + ".- ");
                    break;
                case "C":
                    valor = (int) importe;
                    System.out.println("El Importe Final a Abonar por el Asociado es de: $ " + valor + ".- ");
                    break;
                default:
                    System.out.println(" El Plan elegido no existe, ingreselo nuevamente.");
            }
        } while (!(plan.equals("A") || plan.equals("B") || plan.equals("C"))); //ver problema del default sale primero
    }
    
}
