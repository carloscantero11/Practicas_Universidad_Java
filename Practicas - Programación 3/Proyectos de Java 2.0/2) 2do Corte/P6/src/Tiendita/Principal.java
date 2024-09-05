package Tiendita;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        ArrayList<Producto>prod = new ArrayList<Producto>();
        Apoyo.leoVentas(prod);
        Apoyo.mostrar(prod);
        
        
    }
    
}
