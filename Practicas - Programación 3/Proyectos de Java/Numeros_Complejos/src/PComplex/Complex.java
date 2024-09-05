package PComplex;

public class Complex {
    
    private double real;
    private double img;
    private static int cont = 0;

    public Complex() {
        real = 0;
        img = 0;
        cont++;
    }

    public Complex(double r, double i) {
        real = r;
        img = i;
        cont++;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }
    
    public void mostrar(){
        System.out.println("Real");
        if(img>=0) System.out.println(" + "+img+"i");
        else System.out.println(" "+img+"i");
    }
    
    public void suma(Complex t){
        this.real = this.real + t.real;
        this.img = this.img + t.img;
    }
    
    public static void cantComplex(){
        System.out.println("Hay "+cont+" Objetos de la clase creados.");
    }
    
    
    
    
    
}
