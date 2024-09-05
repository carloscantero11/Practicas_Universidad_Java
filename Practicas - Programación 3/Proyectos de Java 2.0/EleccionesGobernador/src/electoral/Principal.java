package electoral;

public class Principal {

    public static void main(String[] args) {
        
        String candidatos[] = new String[5];
        int votosObtenidos[][] = new int[5][4];
        
        candidatos = Electoral.LeoCandidatos();
        votosObtenidos = Electoral.crarMatrizVotos();
        Electoral.mostrarDatos(candidatos, votosObtenidos);
        Electoral.candidatos(candidatos, votosObtenidos);
        }
    
}
