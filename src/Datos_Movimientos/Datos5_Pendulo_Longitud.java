package Datos_Movimientos;

public class Datos5_Pendulo_Longitud {

    private double a;

    public Datos5_Pendulo_Longitud(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double Periodo() {
        double c, d;
        d = getA() / 9.81;
        c = (2 * Math.PI) * Math.sqrt(d);
        return c;
    }

    public double frecuencia() {
        double f;
        f = 1 / Periodo();
        return f;
    }

}
