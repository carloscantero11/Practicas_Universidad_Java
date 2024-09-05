package Competicion;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        int cantR;
        cantR = Apoyo.regTiempos();
        Participante par[] = new Participante[cantR];
        Apoyo.leoTiempos(par);;
        Apoyo.mostrar(par);
        
        
    }
    
}
