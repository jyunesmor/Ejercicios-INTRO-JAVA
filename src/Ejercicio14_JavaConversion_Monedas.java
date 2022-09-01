/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio14_JavaConversion_Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea una aplicación que a través de una función nos convierta una cantidad de euros
           introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
           función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
           una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
           (void).
                El cambio de divisas es:
                                        * 0.86 libras es un 1 €
                                        * 1.28611 $ es un 1 €
                                        * 129.852 yenes es un 1 €
        */
        
        Scanner leer = new Scanner(System.in); 
        System.out.println( " -------------------- ");     
        System.out.println( " Convertor de Monedas "); 
        System.out.println( " -------------------- "); 
        System.out.println("");
        // Ingreso de Valor a Cambiar
        
        System.out.println( " ¿Ingrese el Importe de Euros a Cambiar? "); 
        int euro = leer.nextInt();
         
            String moneda = moneda(); // funcion carga moneda
            cambio(moneda,euro); // conversion a Moneda Extranjera
    }
    
    public static String moneda(){
        
        Scanner leer = new Scanner(System.in); 
        // Ingreso moneda a convertir
        System.out.println( " ¿Ingrese a que Moneda desea Cambiar? "); 
        String moneda = leer.nextLine();
        moneda = moneda.toLowerCase();
        return moneda;

    }
        public static void cambio(String moneda, double euro){
        //   Ingreso moneda a convertir
        //   * 0.86 libras es un 1 €
        //   * 1.28611 $ es un 1 €
        //   * 129.852 yenes es un 1 €
        System.out.println(" La Moneda elegida es: " + moneda );
            switch (moneda) {
                case "dolares":
                    double dolar = 1.28611 * euro /1 ; 
                    System.out.println("El Valor de " + euro + " €, en Dolares es:USD " + dolar);
                    break;
                case "yenes":
                    double yenes = 129.852 * euro /1 ; 
                    System.out.println("El Valor de " + euro + " €, en Yenes es: ¥ " + yenes);
                    break;  
                case "libras":
                    double libras = 0.86 * euro /1 ; 
                    System.out.println("El Valor de " + euro + " €, en Libras es: £ " + libras);
                    break;
                default:
                    System.out.println("La Opcion no corresponde a una opcion valida,  ingresa una Moneda correcta");;
            }
    }
}
