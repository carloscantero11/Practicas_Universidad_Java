package Concurso;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {
        ArrayList<Aspirante> parti = new ArrayList<Aspirante>();
        Plantilla plan[] = new Plantilla[6];
        Apoyo.leoPlantilla(plan);
        Apoyo.leoExamen(parti, plan);
        Apoyo.mostrar(parti);
    }
    
}
