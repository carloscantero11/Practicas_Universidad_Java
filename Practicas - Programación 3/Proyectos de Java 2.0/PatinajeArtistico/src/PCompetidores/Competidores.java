package PCompetidores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Competidores {
    
    public static int reg() throws IOException{
        
        Scanner r = new Scanner(new File("src/PCompetidores/Competidores.txt"));
        int c = 0;
        while(r.hasNextLine()){
            r.nextLine();
            c++;
        }
        r.close();
        return c;
    } 
    
    public static void leoCompetidores(String n[], int p[][]) throws IOException{
        
        Scanner r = new Scanner(new File("src/PCompetidores/Competidores.txt"));
        int c = 0;
        
        while(r.hasNextLine()){
            n[c] = r.next();
            for (int j = 0; j < p[0].length; j++) {
                p[c][j] = r.nextInt();
            }
            c++;
        }
        r.close(); 
    }
    
    public static void mayor(int p[][], int vm[]){
        
        for (int i = 0; i < p.length; i++) {
            vm[i] = p[i][0];
            for (int j = 0; j < p[0].length; j++) {
                if(p[i][j]>vm[i]){
                    vm[i] = p[i][j];
                }
            }
        }
        
    }
    
    public static void menor(int p[][], int vme[]){
        
        for (int i = 0; i < p.length; i++) {
            vme[i] = p[i][0];
            for (int j = 0; j < p[0].length; j++) {
                if(p[i][j]<vme[i]){
                    vme[i] = p[i][j];
                }
            }
        }
        
    }
    
    public static void calculo(int p[][], int vm[], int vme[], double pt[]){
        int s;
        for (int i = 0; i < p.length; i++) {
            s=0;
            for (int j = 0; j < p[0].length; j++) {
                s += p[i][j];
            }
            pt[i] = (double)(s-vm[i]-vme[i])/(p[0].length-2);
        }
        
    }
    public static void imprimir(String n[],int p[][], double pt[]){
        
        System.out.println("RESULTADOS\n");
        System.out.println(" Nombre    Calificaciones       Puntaje\n");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%7s",n[i]);
            for (int j = 0; j < p[0].length; j++) {
                System.out.printf("%4d",p[i][j]);                
            }
            System.out.printf("   %4.2f\n",pt[i]);
        }
        
    }
}
