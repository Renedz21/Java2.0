package Datos_Movimientos;

public class Datos1_mru {

    private double a;
    private double b;
    private double c;

    public Datos1_mru(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double Mate() {
        double d = 0;
        d = getA() + (getB() * getC());
        return d;
    }
    

}
