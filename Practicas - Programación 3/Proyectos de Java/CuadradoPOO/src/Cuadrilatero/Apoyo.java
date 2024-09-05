package Cuadrilatero;

public class Apoyo {
    
    private float lado1;
    private float lado2;

    public Apoyo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Apoyo(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float gePerimetro() {
        float perimetro;
        perimetro = 2*(lado1*lado2);
        return perimetro;
    }

    public float getArea() {
        float area = lado1*lado2;
        return area;
    }
}

