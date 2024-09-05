import java.util.Scanner;

/* crearemos un vector de 5 elementos enteros, cada posición del vector será llenada
leyendo el valor desde el teclado, una vez lleno el vector procederemos a calcular el
valor promedio del vector y mayor valor almacenado en el mismo, lo primero que haremos
será crear una clase llamada Apoyo donde vamos a definir una serie de métodos que nos
permitan realizar cada una de las tareas planteadas. */

public class Apoyo {
    private static int leerEntero(){
        int valor;
        Scanner en = new Scanner(System.in);
        System.out.print("Deme un valor entero: ");
        valor = en.nextInt();
        return valor;
    }
    
    public static int[] llenarVector(){
        int v[]= new int [5];
        int  x;
        for(x=0; x<v.length; x++){
            v[x] = leerEntero();
        }
        return v;
    }
    
    public static double promedio(int v[]){
        double prom, suma=0;
        for(int x=0; x<v.length; x++){
             suma += v[x];
        }
        prom = suma/5;
        return prom;
    }
    
    public static void mayorValor(int v[]){
        int mayor = v[0];
        for(int x=0; x<v.length; x++){
            mayor = Math.max(mayor, v[x]);
        }
        
        System.out.println("Valor mayor del arreglo: "+mayor);
    }
}
