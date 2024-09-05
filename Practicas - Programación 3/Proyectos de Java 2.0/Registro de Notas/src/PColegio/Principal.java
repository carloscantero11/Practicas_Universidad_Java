package PColegio;

import java.io.IOException;


public class Principal {

    public static void main(String[] args) throws IOException {
        
        int cf;
        cf = Colegio.cReg();
        String no[] = new String [cf];
        double notaF[][]=new double[cf][2];
        double pro[] = new double[cf];
        Colegio.leoAlumnos(no, notaF);
        Colegio.calProm(notaF, pro);
        Colegio.mostrar(no, notaF, pro);
    }
    
}
