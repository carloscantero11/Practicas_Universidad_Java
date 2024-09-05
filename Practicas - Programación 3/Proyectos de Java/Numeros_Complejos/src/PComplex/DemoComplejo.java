package PComplex;

public class DemoComplejo {
    
    
    
    public static void main(String[] args) {
        Complex a,b,d;
        Complex.cantComplex();
        
        a = new Complex(2,5);
        b = new Complex(3,8);
        Complex.cantComplex();
        d = new Complex();
        Complex.cantComplex();
        
        System.out.println("Complejo A");
        a.mostrar();
        
        System.out.println("Complejo B");
        b.mostrar();
        a.suma(b);
        
        System.out.println("La suma de estos complejos en A");
        a.mostrar();
        
        System.out.println("Complejo D creado con el contructor pot defecto");
        d.mostrar();
        
        System.out.println("Modificamos el complejo D");
        d.setReal(13);
        d.mostrar();
        d.setImg(-29);
        d.mostrar();
        
        System.out.println("Parte real");
        d.getReal();
        
        System.out.println("Parte imaginaria");
        d.getImg();
    }
    
}
