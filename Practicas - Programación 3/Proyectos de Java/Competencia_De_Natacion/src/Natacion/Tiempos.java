package Natacion;

public class Tiempos {
    
    private int min, seg, cseg;
    
    public Tiempos (int m, int s, int c){
        min = m;
        seg = s;
        cseg = c;     
    }
    public Tiempos(){
        min = 0;
        seg = 0;
        cseg = 0;
    }
    
    public int TotalCseg(){
        int totalcs;
        totalcs = getMin()*600000+getSeg()*1000+getCseg();
        return totalcs;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public void setCseg(int cseg) {
        this.cseg = cseg;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public int getCseg() {
        return cseg;
    }
    
    
    
}
