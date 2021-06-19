package Datos_Vectores;

public class Producto_vectorial {

    private double a, b, c, d, e, f;

    public Producto_vectorial(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double Formula1() {

        double a = 0;
        a = ((getB() * getF()) - (getC() * getE()));
        return a;
    }
    
    public double Formula2(){
        double b = 0;
        b = ((getC() * getD()) - (getA() * getF()));
        return b;
    }
    
    public double Formula3(){
        double c = 0;
        c = ((getA() * getE()) - (getB() * getD()));
        return c;
    }

}
