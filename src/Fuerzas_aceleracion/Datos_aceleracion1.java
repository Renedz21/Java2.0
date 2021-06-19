
package Fuerzas_aceleracion;


public class Datos_aceleracion1 {
    
    private double n1;
    private double n2;
    private double n3;
    private double n4;

    public Datos_aceleracion1(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
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

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }
    
    public double Formula(){
        double a;
        a = (getN4()-getN3()) / (getN2()-getN1());
        return a;
    }
    
    
}
