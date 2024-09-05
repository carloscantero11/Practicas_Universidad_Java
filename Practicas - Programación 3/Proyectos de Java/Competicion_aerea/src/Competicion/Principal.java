package Competicion;

import java.io.IOException;

public class Principal {


    public static void main(String[] args) throws IOException {
        
        int cantR;
        
        cantR = Apoyo.cr();
        
        Participante par[] = new Participante[cantR];
        
        Apoyo.LeeTiempos(par);
        
        Apoyo.mostrar(par);
        
        
        
        
    }
    
}
