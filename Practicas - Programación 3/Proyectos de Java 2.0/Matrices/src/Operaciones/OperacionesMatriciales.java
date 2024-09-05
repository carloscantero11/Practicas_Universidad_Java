package Operaciones;

import java.util.Scanner;

public class OperacionesMatriciales {
    
    public static int[][] cantidad(){        // Metodo para pedir la cantidad de filas y columnas de una matriz y llenarla. 
        
        int fila, col;
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nCantidad de filas: ");
        fila = n.nextInt();
        System.out.print("Cantidad de columnas: ");
        col = n.nextInt();
        
        int matriz[][] = new int[fila][col];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(19* Math.random()+1);
            }
        }
        return matriz;
    }
    
    public static void mostrar(int a[][]){          // Metodo para imrimir la matriz.
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static int [][] sumaMatriz(int a[][], int b[][]){     // Metodo para sumar 2 matrices.
        
        int suma[][] = new int[a.length][a[0].length];
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            } 
        }
        return suma;
    }
    
    public static int[][] multiplicacionMatriz(int a[][], int b[][]){  // Metodo para multiplicar 2 matrices.
        int multiplicar[][] =  new int [a.length][b[0].length];
        int acum = 0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                acum = 0;
                for (int k = 0; k < a[0].length; k++) {
                    acum += a[i][k]*b[k][j];
                }
                multiplicar[i][j] = acum;
            }
        }
        return multiplicar;
    }
    
    public static int [][] transpuestaMatriz(int a[][]){    // Metodo para Transpuesta de una matriz.
        int t[][] = new int [a[0].length][a.length];
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length; i++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
    
    public static int menu(){                   // Metodo para el menu.
        
        Scanner m = new Scanner(System.in);
        
        System.out.println("Menu Principal");
        System.out.println("(1) Suma de Matrices.");
        System.out.println("(2) Multiplicar Matrices.");
        System.out.println("(3) Transpuesta de una Matriz.");
        System.out.println("(4) Finalizar");
        System.out.println("");
        System.out.print("Indique su opción con un número del 1 al 4: ");
        int num = m.nextInt();
        return num;
    }
}
