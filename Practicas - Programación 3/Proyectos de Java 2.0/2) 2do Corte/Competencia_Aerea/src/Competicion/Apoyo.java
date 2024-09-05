package Competicion;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Apoyo {
    
    public static int regTiempos() throws IOException{
        Scanner n = new Scanner(new File("src/Competicion/Tiempos.txt"));
        int i = -1;
        while (n.hasNextLine()) {
            n.nextLine();
            i++;
        }
        n.close();
        return i;   
    }
    
    public static void leoTiempos(Participante p[]) throws IOException{
        Scanner m = new Scanner(new File("src/Competicion/Tiempos.txt"));
        int i=0;
        int tv;
        double dist;
        String n;
        tv=m.nextInt();
        dist = m.nextDouble();
        
        while (m.hasNextLine()) {
            n = m.next();
            int t[] = new int[tv];
            for (int j = 0; j < t.length; j++) {
                t[j]= m.nextInt();
            }
            p[i]= new Participante(n,t);
            i++;
        }
        m.close();
        for (int k = 0; k < i; k++) {
            p[k].actualizar(dist);
        }
    }
    
    public static void mostrar(Participante p[]){
        
        int band = 0, mtiempo = 0;
        String nnom ="";
        System.out.println("Resultados de competencia aerea");
        System.out.println("Competidor    Tiempo(seg)    Velocidad promedio(km/h)");
        for (int i = 0; i < p.length; i++) {
            p[i].mostrar();
            if(band==0){
                nnom = p[i].getNombre();
                mtiempo = p[i].getTotal();
                band=1;
            }
            else if(p[i].getTotal()<mtiempo){
                nnom = p[i].getNombre();
                mtiempo = p[i].getTotal();
            }
            
        }
        System.out.println("\nEl ganador de la competencia es "+nnom);
        
    }
    
    
    
}
