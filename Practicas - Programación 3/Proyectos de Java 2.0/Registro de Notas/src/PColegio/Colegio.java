package PColegio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Colegio {
    
    public static int cReg() throws IOException{
        Scanner en = new Scanner(new File("src/PColegio/Estudiantes.txt"));
        int cr = 0;
        while(en.hasNextLine()){
            en.nextLine();
            cr++;
        }
        en.close();
        return cr;
    }
 
    public static void leoAlumnos(String n[], double nf[][]) throws IOException{
        
        Scanner en = new Scanner(new File("src/PColegio/Estudiantes.txt"));
        int f=0;
        while(en.hasNext()){
            n[f] = en.next();
            for (int i = 0; i < nf[0].length; i++) {
                nf[f][i] = en.nextDouble();
            }
            f++;
        }
        en.close();
    }
    
    public static void calProm(double nf[][], double pr[]){
        double s;
        
        for (int i = 0; i < nf.length; i++) {
            s=0;
            for (int j = 0; j < nf[0].length; j++) {
                s+=nf[i][j];
            }
            pr[i] = s/nf[0].length;
        } 
    }
    
    public static void mostrar(String n[], double nf[][], double pr[]){
        System.out.println("Nombre         PP1    PP2   Nota Final");
        for(int i = 0; i < n.length ; i++){
            System.out.printf("%-12s",n[i]);
            for (int j = 0; j < nf[0].length ; j++) {
                System.out.printf("%7.2f", nf [i][j]);
            }
            System.out.printf("%7.2f\n",pr[i]);
        }
    }
    
}
