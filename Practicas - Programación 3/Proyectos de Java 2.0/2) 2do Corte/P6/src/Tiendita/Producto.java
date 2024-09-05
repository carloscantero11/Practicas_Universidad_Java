package Tiendita;

public abstract class Producto {
    
    private double precio;
    private int consumo;
    private int peso;

    public Producto(double pr, int c, int p) {
        precio = pr;
        consumo = c;
        peso = p;
    }

    public double getPrecio() {
        return precio;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }
    
    public abstract void mostrar();
    public abstract double precioFinal();
    
}
