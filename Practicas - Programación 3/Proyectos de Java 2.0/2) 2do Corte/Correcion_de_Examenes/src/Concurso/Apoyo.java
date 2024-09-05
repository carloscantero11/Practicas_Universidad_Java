package Concurso;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Apoyo {
    
    public static void leoPlantilla(Plantilla pr[]) throws IOException{
        
        Scanner a = new Scanner(new File("src/Concurso/Plantilla.txt"));
        String i,r;
        int p, j=0;
        while(a.hasNextLine()){
            i = a.next();
            r = a.next();
            p = a.nextInt();
            pr[j]= new Plantilla(i,r,p);
            j++;
        }
    }
    public static void leoExamen(ArrayList<Aspirante> par,Plantilla pr[]) throws IOException{
        Scanner a = new Scanner(new File("src/Concurso/Examen.txt"));
        String n = null,id,r;
        int cp;
        Respuestas re[]=null;
        Aspirante as;
        while (a.hasNextLine()) {
            n = a.next();
            cp = a.nextInt();
            re = new Respuestas[cp];
            for (int i = 0; i < re.length; i++) {
                id = a.next();
                r = a.next();
                re[i] = new Respuestas(id,r);
            }
            as = new Aspirante(n,re);
            as.setPtosMalas(pr);
            par.add(as);
        }
        a.close();
    }
    
    public static void mostrar(ArrayList<Aspirante>par){
        System.out.println("Nombre      puntos resp Incorrectas");
        for (int i = 0; i < par.size(); i++) {
            par.get(i).mostrar();
        }
        System.out.println();
    }
    
}
