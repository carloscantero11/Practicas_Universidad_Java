package Tiendita;

public class Televisor extends Producto{
    
    private int resolucion;

    public Televisor(int resolucion, double pr, int c, int p) {
        super(pr, c, p);
        this.resolucion = resolucion;
    }
    
     public double precioFinal(){
        double incremento=0;
        incremento += getPrecio();
        switch(getConsumo()){
            case 1:
                incremento+=100;
                break;
            case 2:
                incremento+=60;
                break;
            case 3:
                incremento+=30;
                break;
        }
        if(getPeso()>=0&&getPeso()<=19){
            incremento+=10;
        }
        else if(getPeso()>=20&&getPeso()<=49){
            incremento+=50;
        }
        else if(getPeso()>=50&&getPeso()<=79){
            incremento+=80;
        }
        else{
            incremento+=100;
        }
        
        if(resolucion>40){
            incremento= incremento*0.30;
        }
        
        return incremento;
    }  
    
    public void mostrar(){
        System.out.println("\nTelevisor");
        System.out.println("\nPrecio base: "+getPrecio());
        System.out.println("Consumo energetico: "+getConsumo());
        System.out.println("Peso: "+getPeso()+"\nResolución: "+resolucion+"\nPrecio final: "+precioFinal());
    }
}
