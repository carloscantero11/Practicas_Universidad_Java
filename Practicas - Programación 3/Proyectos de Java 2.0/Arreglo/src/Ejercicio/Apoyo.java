package Ejercicio;

import java.util.Scanner;

public class Apoyo {
    
    private static int leerEntero(){
        
        int valor;
        Scanner n = new Scanner(System.in);
        System.out.print("De un valor entero: ");
        valor = n.nextInt();
        return valor;
    }
    
    public static int[] llenaVector(){
        int v[] = new int[5];
        int x;
        for (int i = 0; i < v.length; i++) {
            v[i]= leerEntero();
        }
    return v;    
    }
    
    public static double promedio(int v[]){
        double p,s=0;
        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }
        p = s/v.length;
        return p;
    }
}
