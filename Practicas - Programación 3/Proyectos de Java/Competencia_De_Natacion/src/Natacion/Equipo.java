package Natacion;

public class Equipo {
    
    private String nombre;
    Tiempos tiempo[];
    private int TotalCseg;
    Tiempos tiempoTotal;
    
    public Equipo(String n, Tiempos t[]){
        nombre = n;
        tiempo = t;
        convertir();
        tiempoTotal = toTiempo;
        
    }
    
}
