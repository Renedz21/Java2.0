/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos_Velocidad;

/**
 *
 * @author Microsoft
 */
public class Velocidad_Angular_2 {
    private double n1;

    public Velocidad_Angular_2(double n1) {
        this.n1 = n1;
    }
    
    
        public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }


    
    public double Formula(){
        double a;
        a = (2*Math.PI)*getN1();
        return a;
    }
    
}
