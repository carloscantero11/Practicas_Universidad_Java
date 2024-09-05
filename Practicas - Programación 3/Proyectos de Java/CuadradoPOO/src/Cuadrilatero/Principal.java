package Cuadrilatero;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Apoyo c1;
        float lado1,lado2;
        
        Scanner lados = new Scanner(System.in);
        
        System.out.println("Lado 1: ");
        lado1 = lados.nextFloat();
        System.out.println("Lado 2: ");
        lado2 = lados.nextFloat();
        
        if(lado1==lado2){
            c1 = new Apoyo(lado1);
        }
        
        else{
            c1 = new Apoyo(lado1, lado2);
        }
        
        System.out.println("Área: " + c1.getArea());
        System.out.println("Perímetro: " + c1.gePerimetro());
    }
    
}
