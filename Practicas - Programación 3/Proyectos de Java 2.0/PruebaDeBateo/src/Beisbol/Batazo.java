package Beisbol;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Batazo {
    
    public static int reg() throws IOException{
        Scanner r = new Scanner(new File("src/Beisbol/Batazos.txt"));
        int i=0;
        
        while(r.hasNextLine()){
            r.nextLine();
            i++;
        }
        r.close();
        return i;
    }
    
    public static void leoArchivo(String v[], double m[][]) throws IOException{
        Scanner r = new Scanner(new File("src/Beisbol/Batazos.txt"));
        int c=0;
        
        while(r.hasNextLine()){
            v[c] = r.next();
            for (int j = 0; j < m[0].length; j++) {
                m[c][j] = r.nextDouble();
            }
            c++;
        }
        r.close();
    }
    
    public static void mostrar(String v[], double m[][]){
        System.out.println("Listado de Bateadores\n");
        System.out.println("Nombre       Altura     Velocidad     Angulo");
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%-14s",v[i]);
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%-12.2f",m[i][j]);
            }
            System.out.println("");
        }
    }
    
    private static double grados(double grad){
        
        double radianes;
        radianes = (grad* Math.PI)/180;
        
        return radianes;
    }
    
    private static double LongitudMax(double vel, double ang){
        double lMax;
        double g = 9.81;
        lMax = (vel*vel*Math.sin(2*ang))/g;
        
        return lMax;
    }
    
    private static double alturaMax(double aIni, double lMax, double vel, double ang){
        double aMax;
        double g = 9.81;
        
        aMax = aIni + lMax * Math.tan(ang) - ((g*lMax*lMax)/(2*vel*vel*Math.cos(ang*ang)));
        
        return aMax;
    }
    
    public static void resultados(double m[][], double res[][]){
        double vel, ang, aIni, lMax, aMax;
        
        for (int i = 0; i < m.length; i++) {
            aIni = m[i][0];
            vel = m[i][1];
            ang = grados(m[i][2]);
            res[i][0] = LongitudMax(vel, ang); 
            res [i][1] = alturaMax(aIni, res[i][0], vel, ang);
        }
    }
    
    public static void mostrar2(String v[], double res[][]){
        double hs = 36.88, hms=128.49, am=3.5, g=9.81, x,y;
        String estatus="";
        System.out.println("\n    Estatus Batazos\n");
        System.out.println("Nombre          xMax       yMax             Estatus");
        for (int i = 0; i < res.length; i++) {
            System.out.printf("%-15s",v[i]);
            System.out.printf("%-10.2f %-14.2f",res[i][0],res[i][1]);
            x=res[i][0];
            y=res[i][1];
                if(x<hs){
                    estatus = "Cayo dentro del campo";
                }
                else if(((x>hs)&&(x<hms))||((x>hms)&&(y<=am))){
                    estatus = "Cayo en los jardines";
                }
                else if((x>hms)&&(y>am)){
                    estatus = "Cayo fuera del parque";
                }
            System.out.printf("%-30s\n",estatus);
        }
        
    }
    
}
