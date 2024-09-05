package Geometria;

public class Cilindro extends Circulo{
    private double altura;
    
    public Cilindro(double r, double a){
        super(r);
        altura=a;
    }
    
    public double area(){
        double a;
        a=2*Math.PI*radio*(altura+radio);
        return a;
    }
    
    public void mostrar(){
        System.out.println("Datos del cilindro:");
        super.mostrar();
        System.out.println("Altura: "+altura);
    }
    
    public double volumen(){
        double v;
        v=Math.PI*radio*radio*altura;
        return v;
    }    
    
}
