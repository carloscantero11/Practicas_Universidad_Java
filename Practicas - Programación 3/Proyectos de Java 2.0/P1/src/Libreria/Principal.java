package Libreria;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        int cr, mat[][],clasi[],util[],pronost[],costUni[];
        String nombre[];
        double porcGan[],costPedido[],margen[] ;
        cr = Libros.regLibros();
        nombre = new String [cr];
        mat = new int[cr][5];
        clasi= new int[cr];
        util = new int[cr];
        pronost = new int[cr];
        costUni = new int[cr];
        porcGan = new double[cr];
        costPedido = new double[cr];
        margen = new double[cr];
        
        Libros.leoLibros(nombre, mat);
        Libros.mostrar(nombre, mat, margen, pronost, costPedido, porcGan, margen);
    }
    
}
