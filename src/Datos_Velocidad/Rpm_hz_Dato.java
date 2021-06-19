
package Datos_Velocidad;

public class Rpm_hz_Dato {
    
    private double n1;

    public Rpm_hz_Dato(double n1) {
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
        a = getN1()/60;
        return a;
    }
    
}
