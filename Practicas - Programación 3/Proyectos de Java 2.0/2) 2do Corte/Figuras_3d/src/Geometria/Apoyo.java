package Geometria;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Apoyo {
    
    public static int regFiguras() throws IOException{
        Scanner r = new Scanner(new File("src/Geometria/Figuras.txt"));
        int i=0;
        String reg;
        while (r.hasNextLine()) {
            reg = r.nextLine();
            i++;
        }
        r.close();
        return i;
    }
    public static void leoFiguras(Circulo c[]) throws IOException{
        Scanner leo = new Scanner(new File("src/Geometria/Figuras.txt"));
        int fig,i=0;
        
        while (leo.hasNextLine()) {
            fig = leo.nextInt();
            if(fig==1){
                c[i]= new Esfera(leo.nextDouble());
            }
            else if(fig ==2){
                c[i]= new Cilindro(leo.nextDouble(),leo.nextDouble());
            }
            i++;
        }
    }
    
    public static void mostrar(Circulo c[]){
        for (int i = 0; i < c.length; i++) {
            System.out.println("\n--------------------------------------------------");
            c[i].mostrar();
            System.out.printf("%-11s %8.2f\n","Area: ",c[i].area());
            System.out.printf("%-11s %8.2f","Volumen: ",c[i].volumen());
        }
    }
    
    public static int menu(){
        int opc=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1) Leer Archivo");
        System.out.println("2) Mostrar");
        System.out.println("3) Terminar");
        System.out.print("Escoja su opcion de trabajo: ");
        opc = teclado.nextInt();
        return opc;
    }
    
    
    
    
}
