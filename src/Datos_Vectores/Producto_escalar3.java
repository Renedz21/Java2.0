
package Datos_Vectores;

public class Producto_escalar3 {
    
    private double a,b,c;

    public Producto_escalar3(double a, double b, double c) {
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
    
    public double Formula1(){
        double n1 = 0,n2,n3;
        
        n1 = (getA()*getB())* Math.cos(Math.toRadians(getC()));
        n2 = Math.round(n1*Math.pow(10, 3));
        n3 = n2 / Math.pow(10, 3);
        return n3;
    };
    
}
