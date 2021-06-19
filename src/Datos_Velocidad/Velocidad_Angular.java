package Datos_Velocidad;

public class Velocidad_Angular {

    private double n1;
    private double n2;

    public Velocidad_Angular(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double Formula() {
        double a;
        a = getN1() / getN2();
        return a;
    }
}
