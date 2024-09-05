package Concurso;

public class Plantilla {
    
    private String id; //Identificación de la pregunta
    private String resp; 
    private int ptos;

    public Plantilla(String i, String r, int p) {
        id = i;
        resp = r;
        ptos = p;
    }

    public String getId() {return id;}
    public String getResp() {return resp;}
    public int getPtos() {return ptos;}
    
    
    
    
    
}
