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
public class Datos_aceleracion2 {

    private double n1;
    private double n2;
    private double n3;
    private double n4;

    public Datos_aceleracion2(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
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

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

    public double Formula() {
        double a;
        a = ((2 * (getN3() - getN1())) / (Math.pow(getN4(), 2))) - ((2 * getN2()) / getN4());
        return a;
    }

}
