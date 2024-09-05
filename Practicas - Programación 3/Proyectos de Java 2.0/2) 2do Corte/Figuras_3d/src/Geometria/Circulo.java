package Geometria;

public abstract class Circulo {
    
    protected double radio;
    
    public Circulo(double r){
        radio = r;
    }
    
    public double area(){
        double a;
        a= Math.PI*Math.pow(radio, 2);
        return a;
    }
    
    public void mostrar(){
        System.out.println("Radio: "+radio);
    }
    
    public abstract double volumen();
}
