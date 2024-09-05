package Beisbol;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        int cr;
        String nombre[];
        double batazo[][];
        double valores[][];
        cr = Batazo.reg();
        nombre = new String [cr];
        batazo = new double [cr][3];
        valores = new double [cr][2];
        Batazo.leoArchivo(nombre, batazo);
        Batazo.mostrar(nombre, batazo);
        Batazo.resultados(batazo, valores);
        Batazo.mostrar2(nombre, valores);
        
    }
    
}
