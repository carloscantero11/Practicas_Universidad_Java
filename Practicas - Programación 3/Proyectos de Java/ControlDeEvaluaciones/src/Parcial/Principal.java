package Parcial;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
        
        Apoyo.LeerEvaluaciones(alumnos);
        Apoyo.mostrarArray(alumnos);
        
        
        
        
    }
    
}
