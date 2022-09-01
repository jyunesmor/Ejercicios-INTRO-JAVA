
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
public class Ejercicio12_Java_dispositivoRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
         dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
         fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
         X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().*/

        Scanner leer = new Scanner(System.in);

        String palabra;

        int contCorrect = 0;
        int contIncorrect = 0;

        do {

            System.out.println(" Ingrese una palabra de 5 Digitos, y que comience con X y termine con O");
            System.out.println("");
            palabra = leer.nextLine();

            palabra = palabra.toUpperCase();
            int lon = palabra.length();

            String letrainicial = palabra.substring(0, 1);
            String letrafinal = palabra.substring(lon - 1);
            System.out.println(letrainicial);
            System.out.println(letrafinal);
            if (lon == 5 && letrainicial.equals("X") && letrafinal.equals("O")) {
                System.out.println(" Correcto");
                contCorrect = contCorrect + 1; 
            } else {
                System.out.println(" Incorrecto");
                contIncorrect = contIncorrect + 1;
            }
        } while (!(palabra.equals("&&&&&")));

        System.out.println("Saliendo del Sistema");

        System.out.println(" La Cantidad de veces ingresados Correctamente es de: " + contCorrect);
        System.out.println(" La Cantidad de veces ingresados Incorrectamente es de: " + contIncorrect);
    }
}
