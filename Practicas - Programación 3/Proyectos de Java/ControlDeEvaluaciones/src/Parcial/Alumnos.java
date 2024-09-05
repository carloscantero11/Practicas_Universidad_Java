package Parcial;

public class Alumnos {
    
    private String nombre;
    private Notas nota;
    
   public Alumnos(String nom, Notas n){
       nombre=nom;
       nota=n;
   } 
    
   public void mostrar(){
       String estatus="Reprobado";
       System.out.printf("%-20s,%05.2f   ",nombre,nota.getPromedio());
       if(nota.getPromedio()>=9.5){
           estatus="Aprobado";
           System.out.printf("%-11s\n",estatus);
       }
   }
    
    
    
    
    
}
