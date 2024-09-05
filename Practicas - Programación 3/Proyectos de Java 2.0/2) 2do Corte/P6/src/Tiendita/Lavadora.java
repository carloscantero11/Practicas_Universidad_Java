package Tiendita;

public class Lavadora extends Producto {
    
    private double carga; 

    public Lavadora(double carga, double pr, int c, int p) {
        super(pr, c, p);
        this.carga = carga;
        
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
        
        if(carga>30){
            incremento+=10;
        }
        
        return incremento;
    }  
    
    public void mostrar(){
        System.out.println("\nLavadora");
        System.out.println("\nPrecio base: "+getPrecio());
        System.out.println("Consumo energetico: "+getConsumo());
        System.out.println("Peso: "+getPeso()+"\nCarga: "+carga+"\nPrecio final: "+precioFinal());
    }
    
    
}
