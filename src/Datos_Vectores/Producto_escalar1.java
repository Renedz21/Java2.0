
package Datos_Vectores;

public class Producto_escalar1 {
    
    private double a;
    private double b;
    private double c;
    private double d;

    public Producto_escalar1(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
    
    public double producto_vectores1(){
        double e;
        e = (getA() * getC());
        return e;
    }
    
    public double producto_vectores2(){
        double f;
        f = (getB() * getD());
        return f;
    }
    
}
