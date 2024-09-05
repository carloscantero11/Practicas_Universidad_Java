package Concurso;

public class Aspirante {
    
    private String nom;
    private Respuesta res[];
    private int ptos;
    private int malas;

    public Aspirante(String n, Respuesta[] r) {
        nom = n;
        res = r;
    }
    
    public void setPtosMalas(Plantilla pr[]) {
        int acumCo = 0, contMal = 0;
        for(int i=0; i<res.length; i++){
            for(int j=0; j<pr.length; j++){
                if(res[i].getId().equals(pr[j].getId())){
                    if(res[i].getResp().equals(pr[j].getResp()))
                        acumCo += pr[j].getPtos();
                } else{ contMal ++; }
            }
        }        
        ptos = acumCo ; malas = contMal;
    }
    
    public void mostrar(){
        System.out.printf("%-12s %3d %10d\n",nom,ptos,malas);
    }
          
         
        
        
    
}
