package electoral;

import java.util.Scanner;

public class Electoral {
    
    public static String[] LeoCandidatos(){
        
        Scanner n = new Scanner(System.in);
        
        String nombre[] = new String [5];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Nombre del candidato: "+(i+1)+": ");
            nombre[i] = n.next();
        }
        return nombre;
    }
    
    public static int[][] crarMatrizVotos(){
        
        int votos[][] = new int[5][4];
        
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos[0].length; j++) {
                votos[i][j] = (int)(201*Math.random()+100);
            }
        }
        return votos;
    }
    
    public static void mostrarDatos(String no[], int vo[][]){
        
        System.out.println("\nDatos de elecciones\n");
        System.out.println("              A   B   C   D");
        for (int i = 0; i < vo.length; i++) {
            System.out.printf("%12s",no[i]);
            for (int j = 0; j < vo[0].length; j++) {
                System.out.printf("%4d",vo[i][j]);
            }
            System.out.println("");
        }
    }
    public static void candidatos(String no[], int vo[][]){
        int totalCandidatos[]= new int [5];
        int totalVotos = 0, band = 0, pos = 0;
        float porcentaje[] = new float[5];        
        float mayor = 0;
        
        for (int i = 0; i < vo.length ; i++) {
            for (int j = 0; j < vo[0].length; j++) {
                totalCandidatos[i]+= vo[i][j];
            }
            totalVotos += totalCandidatos[i];
        }
        
        for (int i = 0; i < porcentaje.length; i++) {
            porcentaje[i] = (float)totalCandidatos[i]/totalVotos*100;
            
            if(band==0){
                mayor = porcentaje[i];
                pos = i;
                band = 1;
            }
            else if(mayor<porcentaje[i]){
                mayor = porcentaje[i];
                pos = i;
            }
        }
        
        System.out.println("\nResultados de las elecciones\n");
        System.out.println("               V     %");
        for (int i = 0; i < porcentaje.length; i++) {
            System.out.printf("%-12s %4d %6.2f \n",no[i],totalCandidatos[i],porcentaje[i]);
        }
        
        System.out.println("\nEl ganador es: "+no[pos]);
    }
}
