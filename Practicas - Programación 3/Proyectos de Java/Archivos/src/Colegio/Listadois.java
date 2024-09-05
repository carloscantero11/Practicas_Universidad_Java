package Colegio;

import java.io.*;
import java.util.*;

public class Listadois {
    
    public static int cantReg() throws IOException{
        
        Scanner lectura = new Scanner(new File("src/Colegio/Alumnoss.txt"));
        int longitud=0; String reg=null;
        while(lectura.hasNextLine()){
            reg = lectura.nextLine();
            longitud++;
        }
        lectura.close();
        return longitud;   
    }
    
    
    
    
    public static void LeeAlum(String n[], int no[][]) throws IOException{
        Scanner lectura = new Scanner(new File("src/Colegio/Alumnoss.txt"));
        int i=0;
        while(lectura.hasNextLine()){
            
            n[i]=lectura.next();
            
            for(int j=0; j<no[0].length;j++){
                no[i][j] = lectura.nextInt();
            }
            i++;
        }
        lectura.close();
        
    }
    
    public static void mostrar(String n[], int no[][]){
        System.out.println("Listado general");
        System.out.println("Nombre      N1 N2 N3");
        for(int i=0; i<no.length;i++){
            System.out.printf("%-12s",n[i]);
            for(int j=0; j<no[0].length; j++){
                System.out.printf("%3d",no[i][j]);
            }
        System.out.println();
        }
    
        
    
    }
    
    
}
