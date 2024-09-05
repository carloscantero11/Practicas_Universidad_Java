package Parcial;

public class Notas {
    private double notas[];
    private double promedio;
    
    public Notas(double n[]){
        notas = n;
        actualizarProm();
    }
    
    private double menorNota(){
        double menor=0;
        int band=0;
        for(int i=0;i<notas.length;i++){
            if(band==0){
                menor=notas[i];
                band=1;
            }
            else{menor=Math.min(menor, notas[i]);}
        }
        return menor;
    }
    
    private double mayorNota(){
        double mayor=0;
        int band=0;
        for(int i=0;i<notas.length;i++){
            if(band==0){
                mayor=notas[i];
                band=1;
            }
            else{mayor=Math.max(mayor, notas[i]);}
        }
        return mayor;
    }
    
    private void actualizarProm(){
        double prom, suma=0;
        for(int i=0; i<notas.length; i++){
            suma+=notas[i];
        }
        prom=(suma - mayorNota()- menorNota() /( notas.length-2) );
        promedio=prom;
    }

    public double getPromedio() {
        return promedio;
    }
    
    
    
    
    
}
