package Libreria;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Libros {
    
    public static int regLibros() throws IOException{
        Scanner r = new Scanner(new File("src/Libreria/Pedidos.txt"));
        int i=0;
        while(r.hasNextLine()){
            r.nextLine();
            i++;
        }
        r.close();
        return i;
    }
    
    public static void leoLibros(String v[], int m[][]) throws IOException{
        Scanner r = new Scanner(new File("src/Libreria/Pedidos.txt"));
        int i=0;
        
        while (r.hasNextLine()) {
            v[i]=r.next();
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = r.nextInt();
            }
            i++;
        }
        r.close();       
    }
    
    private static int[] porcentaje(int m[][], int cl[], int ut[], int p[]){
        
        for (int i = 0; i < m.length; i++) {
            cl[i]=m[i][1];
            ut[i]=m[i][3];
            if(cl[i]==1){
                if(ut[i]==0){
                    p[i] = (m[i][2] *60)/100;
                    Math.round(p[i]);
                }
                else{
                    p[i] = (m[i][2] *85)/100;
                    Math.round(p[i]);
                }
            }
            else{
                if(ut[i]==0){
                    p[i] = (m[i][2] *25)/100;
                    Math.round(p[i]);
                }
                else{
                    p[i] = (m[i][2] *4)/100;
                    Math.round(p[i]);
                }
            }
        }
        return p;
    }
    
    private static double[] costo(int m[][], double c[],double pg[]){
        
        for (int i = 0; i < m.length; i++) {
            c[i]=m[i][4];
            if(c[i]<=800000){
                pg[i] = c[i]*0.25;
            }
            else{
                pg[i] = c[i]*0.20;
            }
        }
        return pg;
    }
    
    public static void mostrar(String v[], int m[][],double pg[],int p[],double c[],double cp[], double mg[]){
        
        System.out.println("Titulo                 Estatus               Requisitos         Costo Pedido      Ganancia");
        
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%-11s",v[i]);
            int estatus = m[i][0] - p[i];
            if(estatus>=0){
                String est = "El libro es requerido";
                cp[i] = estatus * c[i];
                mg[i] = estatus * pg[i];
                System.out.printf("%-30s %-18d %-15.2f %-12.2f\n",est,estatus,cp[i],mg[i]);
            }
            else{
                String est = "El libro no es requerido";
                System.out.printf("%-44s\n",est);
            }
            
            
            
            
        }
        
    }
}
