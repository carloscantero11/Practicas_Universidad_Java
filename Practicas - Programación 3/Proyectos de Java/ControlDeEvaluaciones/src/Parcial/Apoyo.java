package Parcial;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Apoyo {
    
    public static void LeerEvaluaciones(ArrayList<Alumnos> alu) throws IOException{
        Scanner leoEvaluaciones = new Scanner(new File("src/Parcial/Evaluaciones.txt"));
        
        double ve[];
        String no;
        Notas vno;
        Alumnos al;
        
        while(leoEvaluaciones.hasNextLine()){
            String registro = leoEvaluaciones.nextLine();
            Scanner campos = new Scanner(registro);
            campos.useDelimiter(",");
            campos.useLocale(Locale.US);
            no=campos.next();
            ve = new double[5];
            for(int i=0; i<ve.length;i++){
                ve[i]=campos.nextDouble();
            }
            vno = new Notas(ve);
            al = new Alumnos(no,vno);
            alu.add(al);
        }
    }
    
    public static void mostrarArray(ArrayList<Alumnos> alu){
        System.out.println("Nombre              Nota F   Estatus");
        for(int i=0; i<alu.size();i++){
            alu.get(i).mostrar();
        }   
    }

}