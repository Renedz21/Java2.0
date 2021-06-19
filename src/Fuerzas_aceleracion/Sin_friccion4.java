/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuerzas_aceleracion;

/**
 *
 * @author Microsoft
 */
public class Sin_friccion4 {
    
    private double n1;
    private double n2;
    private double n3;

    public Sin_friccion4(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    
    public double Tangente(){
        double h = Math.tan(Math.toRadians(getN2()));
        return h;
    }
    
    public double VelocidadFinal(){
        double a = Math.sin(Math.toRadians(getN2()));
        double b = getN3() * Math.cos(Math.toRadians(getN2()));
        double c = (a-b) / Math.sin(Math.toRadians(getN2()));
        double d = (2 * 9.81 * getN1());
        double e = Math.sqrt(d);
        double f = Math.sqrt(c) * e;
        return f;
    }
    
    public double Tiempo(){
        double a = Math.sin(Math.toRadians(getN2()));
        double b = getN3() * Math.cos(Math.toRadians(getN2()));
        double c = (Math.sin(Math.toRadians(getN2()))) * (a-b);
        double d = 1 / c;
        double e = (2 * getN1()) / 9.81;
        double f = Math.sqrt(e);
        double j = d * f;
        return j;
    }
    
}
