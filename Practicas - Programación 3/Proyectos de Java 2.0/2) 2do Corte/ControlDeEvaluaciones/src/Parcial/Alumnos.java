package Parcial;

public class Alumnos {
    
    private String nombre;
    Notas nota;

    public Alumnos(String n, Notas vno) {
        nombre = n;
        nota = vno;
    }
    
    public void mostrar(){
        String estatus = "Reprobado";
        System.out.printf("%-20s %05.2f   ",nombre,nota.getNotaFinal());
        if (nota.getNotaFinal()>=9.5) estatus="Aprobado";
        System.out.printf("%-11s\n",estatus);
    }
    
}
