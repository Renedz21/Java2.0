package Fuerzas_aceleracion;

public class Sin_friccion3 {

    private double n1;
    private double n2;

    public Sin_friccion3(double n1, double n2) {
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

    public double Tangente() {
        double a = Math.tan(Math.toRadians(getN1()));
        return a;
    }

    public double Aceleracion() {
        double b = 0;
        b = (9.81 * Math.sin(Math.toRadians(getN1()))) - (getN2() * 9.81 * Math.cos(Math.toRadians(getN1())));
        return b;
    }

}
