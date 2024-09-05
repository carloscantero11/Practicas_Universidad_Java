package Competicion;

public class Participante {
    
    private String nom;
    private int tiempo[];
    private int tiempoTotal;
    private double velp;

    public Participante(String n, int[] t) {
        nom = n;
        tiempo = t;
    }
    
    public void actualizar(double d){
        tiempoTotal = 0;
        for(int i=0; i<tiempo.length; i++){
            tiempoTotal += tiempo[i];
        }
        velp = d/tiempoTotal*3600;
        
    }

    public String getNom() {
        return nom;
    }

    public int getTiempo() {
        return tiempoTotal;
    }
    
    public void mostrar(){
        System.out.printf("%-12s %5d %20.2f\n",nom,tiempoTotal,velp);
    }

}
