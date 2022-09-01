package Ejercicio_Java_Extra;


import java.util.Scanner;


public class Ejercicio14_JavaExtra_PromedioHijosFamilias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias. */
    
        Scanner leer = new Scanner (System.in);
        
        System.out.println(" Ingrese la Cantidad de Familias a Calcular");
        int fam = leer.nextInt();
        int edad = 0;
        int hijos = 0, sumEdad = 0;
        double prom = 0;
        int cantidadHijos = 0;
        
        for (int i = 0; i < fam ; i++)
        {
            System.out.println(" Ingrese la Cantidad de Hijos a Calcular de la familia " + (i+1));
            hijos = leer.nextInt();
        
            for (int j = 0; j < hijos ; j++) {
               System.out.println(" Ingrese la edad del Hijo " + (j+1) + " de la Familia " + (i+1));
               edad = leer.nextInt();
               sumEdad = sumEdad + edad;
               cantidadHijos = cantidadHijos + 1;
            }
        }
        prom = sumEdad / cantidadHijos;
//        System.out.println(sumEdad);
//        System.out.println(cantidadHijos);
        System.out.println(" La Edad Promedio de los Hijos de las " + fam + " Familias ingresadas es de: "+ prom);
    }
}
