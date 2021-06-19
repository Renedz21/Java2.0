package Datos_Movimientos;

public class Datos5_Pendulo_Periodo {

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Datos5_Pendulo_Periodo(double a) {
        this.a = a;
    }

    public double Longitud() {
        double l;
        l = (Math.pow(getA(), 2) * 9.81) / (4 * (Math.pow(Math.PI, 2)));
        return l;
    }

    public double frecuencia() {
        double f;
        f = 1 / getA();
        return f;
    }

}
