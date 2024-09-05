package Tiendita;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Apoyo {
    
    public static void leoVentas(ArrayList<Producto>prod) throws IOException{
        
        Scanner leo = new Scanner(new File("src/Tiendita/Ventas.txt"));
        Producto pro = null;
        int i=0, poli;
        int c,p,resolucion;
        double pr,carga;
        
        while (leo.hasNextLine()) {
            poli= leo.nextInt();            
            pr = leo.nextDouble();
            c = leo.nextInt();
            p = leo.nextInt();
            
            if(poli==1){
                
                carga = leo.nextDouble();
                pro = new Lavadora(carga, pr, c, p);
            }
            else if(poli==2){
                
                resolucion = leo.nextInt();
                pro = new Televisor(resolucion, pr, c, p);
            }
            prod.add(pro);
        }
        leo.close();   
    }
    
    public static void mostrar(ArrayList<Producto>prod){
        
        for (int i = 0; i < prod.size(); i++) {
            prod.get(i).mostrar();
            
        }
        
    }
    
    
    
}
