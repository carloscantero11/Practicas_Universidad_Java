package Laboratorio;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Calidad {
    
    public static int reg() throws IOException{
        
        Scanner r = new Scanner(new File("src/Laboratorio/Lotes.txt"));
        int c = 0;
        
        while(r.hasNextLine()){
            r.nextLine();
            c++;
        }
        r.close();
        return c;
    }
    public static void leoArchivo(String v[], double m[][])throws IOException{
        
        Scanner r = new Scanner(new File("src/Laboratorio/Lotes.txt"));
        int i=0;
        
        while(r.hasNextLine()){
            String linea = r.nextLine();
            Scanner separar = new Scanner(linea);
            separar.useDelimiter(",");
            separar.useLocale(Locale.US);
            while(separar.hasNextLine()){
                v[i] = separar.next();
                for (int j = 0; j < m[0].length; j++) {
                    m[i][j] = separar.nextDouble();
                }
            }
            i++;
        } 
    }
    
    public static void mostrar(String v[], double m[][]){
        System.out.println("N° Lote   -----%Carbono------  -----%Magnesio-----");
        
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%-8s",v[i]);
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%7.2f",m[i][j]);
            }
            System.out.println("");
        }     
    }
    
    public static void promedios(double m[][], double p[][]){
        double sc = 0, sm = 0;
        for (int i = 0; i < m.length; i++) {
            sc= m[i][0]+m[i][1]+m[i][2];
            sm= m[i][3]+m[i][4]+m[i][5];
            p[i][0]=sc/3;
            p[i][1]=sm/3;
        }
    }
    
    public static void resultado(double p[][], String res[]){
        
        for (int i = 0; i < p.length; i++) {
            if(((p[i][0]>24.92) && (p[i][0]<27.92)) && ((p[i][1]>19.84) && (p[i][1]<25.30))){
                res[i] = "Aprobado";
            }
            else{
                res[i] = "Rechazado";
            }
        }
        
    }
    
    public static void mostrarResultados(String v[],double p[][],String res[]){
        
        System.out.println("\nResultados del laboratodio\n");
        System.out.println("         Carbono   Magnesio");
        System.out.println("Mínimo    24.92     19.84");
        System.out.println("Máximo    27.92     25.30\n");
        System.out.println("N° Lote  Prom %C    Prom %Mg   Estatus");
        for (int i = 0; i < res.length ; i++) {
            System.out.printf("%-9s %-7.2f %8.2f %12s\n",v[i],p[i][0],p[i][1],res[i]);
        }
    }
    
}
