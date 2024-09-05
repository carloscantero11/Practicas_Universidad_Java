package Colegio;

import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        int tf,tc = 3;
        int notas[][];
        String nom[];
        
        tf = Listadois.cantReg();
        nom = new String[tf];
        notas = new int[tf][tc];
        Listadois.LeeAlum(nom, notas);
        Listadois.mostrar(nom, notas);

    }
    
}
