package Trayecto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Particulas {
    
    public static int reg() throws IOException{
        Scanner r = new Scanner(new File("src/Trayecto/Coordenadas.txt"));
        int i=0;
        while (r.hasNextLine()) {
            r.nextLine();
            i++;
        }
        r.close();
        return i;
    }
    
    public static void leoCoordenadas(String v[], double m[][]) throws IOException {
        Scanner r = new Scanner(new File("src/Trayecto/Coordenadas.txt"));
        int i=0;
        while (r.hasNextLine()) {
            v[i] = r.next();
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = r.nextDouble();
            }
            i++;
        }
        r.close();
    }
    
    public static void xY(double c[][],double m[][]){
        
        for (int i = 0; i < m.length; i++) {
            
        }
        
        
        
    }
    
    
    
}
