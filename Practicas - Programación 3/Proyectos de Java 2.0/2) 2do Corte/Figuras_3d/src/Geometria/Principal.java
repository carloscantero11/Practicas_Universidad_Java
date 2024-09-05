package Geometria;

import java.io.IOException;

public class Principal {

     public static void main(String[] args) throws IOException {
        Circulo ci[];
        int tam=0, opc=0;
        tam = Apoyo.regFiguras();
        ci = new Circulo[tam];
         while (opc!=3) {
             opc=Apoyo.menu();
             switch(opc){
                 case 1:
                     Apoyo.leoFiguras(ci);
                     break;
                 case 2:
                     Apoyo.mostrar(ci);
                     break;
             }
         }
    }    
}