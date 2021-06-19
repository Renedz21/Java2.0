
package Datos_Movimientos;

public class Datos3_parabola {
    
    private double a ;//vo
    private double b;//angulo
    private double c;//posicion horizontal x0
    private double d;//altura y
    private double e = 9.81;

    public Datos3_parabola(double a, double b, double c, double d) {
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
    
    
    public double VelocidadHorizontal(){
        double vx = getA() * Math.cos(Math.toRadians(getB()));
        return vx;
    }
    
    public double VelocidadVertical(){
        double vy = (getA() * Math.sin(Math.toRadians(getB())));
        return vy;
    }
    
    public double TiempoAlturaMaxima(){
        double thmax = VelocidadVertical() / 9.81;
        return thmax;
    }
    
    public double AlturaMax(){
        double f = ((Math.pow(getA(), 2)) / (2 * 9.81)) * (Math.pow(Math.sin(Math.toRadians(getB())), 2));
        return f;
    }
    
    public double MaximoAlcance(){
        double ma = (Math.pow(getA(), 2) * (Math.sin(Math.toRadians(getB())) * 2) / 9.81) ;
        return ma;
    }
    
    public double TiempoTotal(){
        double t = (2 * getA() * Math.sin(Math.toRadians(getB()))) / 9.81;
        return t;
    }
    
}
