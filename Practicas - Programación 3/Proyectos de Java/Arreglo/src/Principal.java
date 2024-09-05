public class Principal {

    public static void main(String[] args) {
        
        int vector[] = new int[5];
        vector = Apoyo.llenarVector();
        System.out.println("Valor promedio del vector: ");
        System.out.println(Apoyo.promedio(vector));
        Apoyo.mayorValor(vector);
    }
    
}
