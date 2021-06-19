package Datos_Movimientos;

public class Datos4_caida {

    private double a;
    private double b;

    public Datos4_caida(double a, double b) {
        this.a = a;
        this.b = b;
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
    
    public double TiempoTotal() {
        double n1, n2 = 0;
        n2 = (2 * getA()) / 9.81;
        n1 = Math.sqrt(n2);
        return n1;
    }

    public double VelocidadFinal() {
        double c, d;
        c = (2 * 9.81 * getA());
        d = -(Math.sqrt(c));
        return d;
    }

    public double Altura() {
        double e;
        e = getA() - ((0.5 * 9.81) * Math.pow(getB(), 2));
        return e;
    }

    public double Velocidad() {
        double f = 0;
        f = -(9.81 * getB());
        return f;
    }

}
