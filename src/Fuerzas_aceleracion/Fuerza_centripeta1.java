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
public class Fuerza_centripeta1 {
    
    private double n1;
    private double n2;
    private double n3;

    public Fuerza_centripeta1(double n1, double n2, double n3) {
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
    
    public double Formula(){
        double b = Math.pow(getN3(), 2) / getN2();
        double a = getN1() *b;
        return a;
    }
    
    
    
    
}
