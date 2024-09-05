package Concurso;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Apoyo {
    
    public static void LeoPlantilla(Plantilla pr[]) throws IOException{
        Scanner archivo = new Scanner(new File("src/Concurso/Plantilla.txt"));
        String i, r;
        int pos=0;
        int p;
        while(archivo.hasNextLine()){
            i=archivo.next();
            r=archivo.next();
            p=archivo.nextInt();
            pr[pos] = new Plantilla(i,r,p);
            pos++;
        }
    }
    
    public static void LeoExamen(ArrayList<Aspirante> par, Plantilla pr[]) throws IOException{
        Scanner archivo = new Scanner(new File("src/Concurso/Examen.txt"));
        String n = null, id, r;
        int cp;
        Respuesta re[] = null;
        Aspirante as;
        while(archivo.hasNextLine()){
            n=archivo.next();
            cp=archivo.nextInt();
            re = new Respuesta[cp];
            for(int i=0; i<re.length;i++){
                id = archivo.next();
                r = archivo.next();
                re[i] = new Respuesta(id,r);
            }
        as = new Aspirante(n,re);
        as.setPtosMalas(pr);
        par.add(as);
        }
        archivo.close();
    }
    
    public static void mostrar(ArrayList<Aspirante>par){
        System.out.println("Nombre      Puntos resp Incorrectas");
        for(int i=0; i<par.size();i++){
            par.get(i).mostrar();
        }
        System.out.println("");
    }
    
}
