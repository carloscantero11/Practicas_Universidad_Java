package Geometria;

public class Esfera extends Circulo{
    
    public Esfera(double r){
        super(r);
    }
    
    public double area(){
        double a;
        a=4*Math.PI*super.area();
        return a;
    }
    
    public void mostrar(){
        System.out.println("Datos de la esfera: ");
        super.area();
    }
    
    public double volumen(){
        double v;
        v= 4/3*Math.PI*Math.pow(radio, 3);
        return v;
    }
    
}
