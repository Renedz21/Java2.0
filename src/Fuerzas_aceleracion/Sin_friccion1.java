
package Fuerzas_aceleracion;

public class Sin_friccion1 {
    private double n1;

    public Sin_friccion1(double n1) {
        this.n1 = n1;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double Formula(){
        double a = 9.81 * Math.sin(Math.toRadians(getN1()));
        return a;
    }
    
}
