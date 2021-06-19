
package Datos_Movimientos;

public class Datos5_Pendulo_Frecuencia {
     private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Datos5_Pendulo_Frecuencia(double a) {
        this.a = a;
    }
    
     public double Periodo() {
        double c;
        c = 1 / getA();
        return c;
    }
     
     public double Longitud() {
        double l;
        l = (Math.pow(Periodo(), 2) * 9.81) / (4 * (Math.pow(Math.PI, 2)));
        return l;
    }

    
}
