package ConsumoElectrico;

public class Energia {
    
    private int ki;
    private int kf;
    private int consumo;

    public Energia(int i, int f) {
        ki = i;
        kf = f;
        consumo = f-i;
    }

    public int getConsumo() {
        return consumo;
    }
    
    public void mostrar(){
        System.out.printf("%-8d %-8d %-9d",ki,kf,consumo);
    }
}
