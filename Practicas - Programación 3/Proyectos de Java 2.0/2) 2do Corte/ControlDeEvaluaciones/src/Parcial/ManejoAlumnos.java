package Parcial;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ManejoAlumnos {
    
    public static void leoEvaluaciones(ArrayList<Alumnos>alu) throws IOException{
        Scanner leo = new Scanner(new File("src/Parcial/Evaluaciones.txt"));
        double ve[];
        String no;
        Notas vno;
        Alumnos al;
        
        while (leo.hasNextLine()) {
            String registro  = leo.nextLine();
            Scanner sep = new Scanner(registro);
            sep.useDelimiter(",");
            sep.useLocale(Locale.US);
            no = sep.next();
            ve = new double[5];
            
            for (int i = 0; i < ve.length; i++) {
                ve[i] = sep.nextDouble();
            }
            vno = new Notas(ve);
            al = new Alumnos(no, vno);
            alu.add(al);
        }
    }
    public static void imprimir(ArrayList<Alumnos>alu){
        
        System.out.println("Nombre              Nota F    Estatus");
        for (int i = 0; i < alu.size(); i++){
            alu.get(i).mostrar();
        }      
    }    
}

