package Laboratorio;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        int cr;
        String ve[],resp[];
        double ma[][],prom[][];
        
        cr = Calidad.reg();
        ve = new String [cr];
        ma = new double [cr][6];
        prom = new double [cr][2];
        resp = new String [cr];
        
        Calidad.leoArchivo(ve, ma);
        Calidad.mostrar(ve, ma);
        Calidad.promedios(ma, prom);
        Calidad.resultado(prom, resp);
        Calidad.mostrarResultados(ve, prom, resp);
    }
}
