package Ejercicio_Java_Extra;


public class Ejercicio20_JavaExtra_ArregloAleatoriofunciomostrar {

    public static void main(String[] args) {
    /* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
    
        int a = 7;
          
        int [] arregloF = new int [a]; 
        
        arregloF = llenarVector(a);
        
        for (int i = 0; i < a; i++) {
            System.out.println(arregloF[i]);
        }
                
  
    }
    
    public static int [] llenarVector(int num) {
        int [] arreglo = new int [num];
        
        for (int i = 0; i < num; i++) {
            arreglo[i]= num;
            num++;
        }
        
        return  arreglo;
    }
}

