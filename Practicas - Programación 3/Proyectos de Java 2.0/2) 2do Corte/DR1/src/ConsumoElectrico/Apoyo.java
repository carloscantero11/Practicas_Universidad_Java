package ConsumoElectrico;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Apoyo {
    
    public static void leoConsumo(ArrayList<Datos> p) throws IOException{ 
        Scanner a = new Scanner(new File("src/ConsumoElectrico/Consumo.txt"));
        String n;
        int i,f;
        Energia eng;
        Datos dt;
        
        while (a.hasNextLine()) {
            String r = a.nextLine();
            Scanner separar = new Scanner(r);
            separar.useDelimiter(",");
            n = separar.next();
            i = separar.nextInt();
            f = separar.nextInt();
            eng = new Energia(i,f);
            dt = new Datos(n,eng);
            p.add(dt);   
        }
        a.close();
    }
    
    public static void mostrar(ArrayList<Datos> p){
        String name="",names="";
        int band=0,com=0,coms=0,ac=0;
        System.out.println("Nombre          Kwi      Kwf   Consumo     Pago");
        for (int i = 0; i < p.size(); i++) {
            p.get(i).mostrar();
            String nom = p.get(i).getNombre();
            int con = p.get(i).getKw().getConsumo();
            if(band ==0){
                name = nom;
                com = con;
                band = 1;
            }
            else if(com<con){
                names = name;
                coms = com;
                name = nom;
                com = con;
                ac=0;
            }
        }
        System.out.println("");
        System.out.println("Salida para todos los subscriptores");
        System.out.println("Subscriptor con mas consumo: "+name);
    }
  
}
