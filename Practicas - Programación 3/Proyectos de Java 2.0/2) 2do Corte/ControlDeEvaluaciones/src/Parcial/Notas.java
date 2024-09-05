package Parcial;

public class Notas {
    
    private double nota[];
    private double notaFinal;
    
    public Notas(double n[]){
        nota = n;
        promedio();
    }
    
    private double menor(){
        double me=0;
        int band=0;
        for (int i = 0; i < nota.length; i++) {
            if(band==0){
                me=nota[i];
                band=1;
            }
            else{
                me = Math.min(me, nota[i]);
            }
        }
        return me;
    }
    
    private double mayor(){
        double ma=0;
        int band=0;
        for (int i = 0; i < nota.length; i++) {
            if(band==0){
                ma=nota[i];
                band=1;
            }
            else{
                ma = Math.max(ma, nota[i]);
            }
        }
        return ma;
    }
    
    private void promedio(){
        double prom, suma=0;
        for (int i = 0; i < nota.length; i++) {
            suma+=nota[i];
        }
        prom = (suma-mayor()-menor())/(nota.length-2);       //  notas.length-2 
        notaFinal=prom;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    
    
}
