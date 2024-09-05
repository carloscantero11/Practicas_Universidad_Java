package Operaciones;

public class Principal {

    public static void main(String[] args) {
        boolean f=true;
        
        while(f==true){
            System.out.println("");
            int numero = OperacionesMatriciales.menu();
            int a [][];
            int b [][];
            switch(numero){
                case 1:
                    a = OperacionesMatriciales.cantidad();
                    System.out.println("\nMatriz A");               //Matriz A
                    OperacionesMatriciales.mostrar(a);
                    
                    b = OperacionesMatriciales.cantidad();
                    System.out.println("\nMatriz B");                // Matriz B
                    OperacionesMatriciales.mostrar(b);
                    
                    int suma[][];
                    suma = OperacionesMatriciales.sumaMatriz(a, b);
                    System.out.println("\nSuma de Matriz A y B\n");   //Suma
                    OperacionesMatriciales.mostrar(suma);
                    System.out.println("");
                    break;
                    
                case 2:
                    
                    a = OperacionesMatriciales.cantidad();
                    System.out.println("\nMatriz A");               //Matriz A
                    OperacionesMatriciales.mostrar(a);
                    
                    b = OperacionesMatriciales.cantidad();
                    System.out.println("\nMatriz B");                // Matriz B
                    OperacionesMatriciales.mostrar(b);
                    
                    int multiplicar[][];
                    multiplicar = OperacionesMatriciales.multiplicacionMatriz(a, b);
                    System.out.println("\nMultiplicación de Matriz A y B\n");                   //multiplicar
                    OperacionesMatriciales.mostrar(multiplicar);
                    System.out.println("");
                    break;
                case 3: 
                    a = OperacionesMatriciales.cantidad();
                    System.out.println("\nMatriz A");               //Matriz A
                    OperacionesMatriciales.mostrar(a);
                    
                    int t[][];
                    System.out.println("\nMatriz Transpuesta");
                    t = OperacionesMatriciales.transpuestaMatriz(a);
                    OperacionesMatriciales.mostrar(t);                      //Transpuesta
                    System.out.println("");
                    break;
                case 4:
                    f=false;
                    break; 
                default:
                    
                    System.out.println("ERROR");
                    System.out.println("Introduzca los datos correctamente.");
                    System.out.println("");
            }        
        }
    }
    
}
