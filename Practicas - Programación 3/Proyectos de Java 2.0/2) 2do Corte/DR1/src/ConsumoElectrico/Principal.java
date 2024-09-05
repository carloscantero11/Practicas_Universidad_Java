package ConsumoElectrico;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {
        ArrayList <Datos> p = new ArrayList<Datos>();
        Apoyo.leoConsumo(p);
        Apoyo.mostrar(p);
    }
    
}
