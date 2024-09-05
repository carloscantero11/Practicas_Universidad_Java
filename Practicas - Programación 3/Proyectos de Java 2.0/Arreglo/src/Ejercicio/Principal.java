package Ejercicio;

public class Principal {

    public static void main(String[] args) {
        
        int vector[] = new int[5];
        vector = Apoyo.llenaVector();
        System.out.println(Apoyo.promedio(vector));
        
    }
    
}
