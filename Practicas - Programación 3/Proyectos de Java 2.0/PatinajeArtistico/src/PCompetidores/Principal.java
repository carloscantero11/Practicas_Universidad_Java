package PCompetidores;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        int cr;
        String n[];
        int m[][];
        int mayore[];
        int menor[];
        double pto[];
        
        cr = Competidores.reg();
        n = new String[cr];
        m = new int[cr][6];
        mayore = new int[cr];
        menor = new int[cr];
        pto = new double[cr];
        
        Competidores.leoCompetidores(n, m);
        Competidores.mayor(m, mayore);
        Competidores.menor(m, menor);
        Competidores.calculo(m, mayore, menor, pto);
        Competidores.imprimir(n, m, pto);
        
    }
    
}
