package Competicion;

public class Participante {
    
    private String nombre;
    private int tiempo[];
    private int total;
    private double velocidad;

    public Participante(String n, int[] t) {
        nombre = n;
        tiempo = t;
    }
    
    public void actualizar(double d){
        total=0;
        for (int i = 0; i < tiempo.length; i++) {
            total+=tiempo[i];
        }
        velocidad = d/total*3600;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotal() {
        return total;
    }
    
    public void mostrar(){
        System.out.printf("%-12s %5d %20.2f \n",nombre,total,velocidad);
    }
    
    
    
}
