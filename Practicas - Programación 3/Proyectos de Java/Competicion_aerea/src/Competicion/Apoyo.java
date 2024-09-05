
package Competicion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Apoyo {
    
    public static int cr() throws IOException{
        
        Scanner en = new Scanner(new File("src/Competicion/Tiempos.txt"));
        int tam = -1;
        while(en.hasNextLine()){
        en.nextLine();
        tam++;
        }
        en.close();
        return tam;                
    }
    
    public static void LeeTiempos(Participante p[]) throws IOException{
        
        Scanner en = new Scanner(new File("src/Competicion/Tiempos.txt"));
        int pos=0;
        int tv; double dist;
        String n;
        tv = en.nextInt();
        dist = en.nextDouble();
        
        while(en.hasNext()){
            n = en.next();
            int t[] = new int[tv];
            for(int i=0; i<t.length; i++){
                t[i] = en.nextInt();
            }
            p[pos] = new Participante(n,t);
            pos++;
        }
        en.close();
        for(int j=0; j<pos; j++){
            p[j].actualizar(dist);
        }
    }
    
    public static void mostrar(Participante p[]){
        int band = 0, mtiempo = 0;
        String nnom ="";
        System.out.println("Resultados Competencia Aerea");
        System.out.println("Competidor    Tiempo(seg)   Vel Prom (Km/h)");
        for(int i=0; i<p.length; i++){
            p[i].mostrar();
            if(band==0){
                nnom = p[i].getNom();
                mtiempo = p[i].getTiempo();
                band = 1;
            }
            else if(p[i].getTiempo()<mtiempo){
                nnom = p[i].getNom();
                mtiempo = p[i].getTiempo();
            }
        }
        System.out.println("\nElganador de la competencia fue: "+nnom);
    }
    
    
}
