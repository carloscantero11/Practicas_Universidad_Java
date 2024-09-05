package ConsumoElectrico;

public class Datos {
    
    private String nombre;
    private Energia kw;
    private double pago;

    public Datos(String n, Energia k) {
        nombre = n;
        kw = k;
        actualizarPago();
    }
    
    private void actualizarPago(){
        int consumo = getKw().getConsumo();
        if(consumo<=100){
            pago = consumo*0.51;
        }
        else if(consumo<=300){
            pago = (100*0.51)+(consumo-100)*0.5;
        }
        else if(consumo<=550){
            pago = (100*0.51)+(200*0.5)+(consumo-300)*0.45; 
        }
        else if(consumo<=850){
            pago = (100*0.51)+(200*0.5)+(250*0.45)+(consumo-550)*0.4;
        }
        else{
            pago = (100*0.51)+(200*0.5)+(250*0.45)+(300*0.4)+(consumo-550)*0.35;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Energia getKw() {
        return kw;
    }
    
    public void mostrar(){
        System.out.printf("%-15s",getNombre());
        getKw().mostrar();
        System.out.printf("%-7.2f\n",pago);
    }
    
    
    
}
