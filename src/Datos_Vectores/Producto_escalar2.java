
package Datos_Vectores;


public class Producto_escalar2 {
    
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public Producto_escalar2(double a, double b, double c, double d, double e, double f) {
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
    
    public double producto_vectores1(){
        double g;
        g = (getA() * getD());
        return g;
    }
    
    public double producto_vectores2(){
        double h;
        h = (getB() * getE());
        return h;
    }
    
    public double producto_vectores3(){
        double i;
        i = (getC() * getF());
        return i;
    }
}
