
package Fuerzas_aceleracion;

public class Fuerza_friccion {
    
    private double n1;
    private double n2;

    public Fuerza_friccion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double Formula(){
        double a = getN1() * getN2();
        return a;
    }
    
    
}
