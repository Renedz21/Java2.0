
package Fuerzas_aceleracion;

import java.util.Scanner;

public class Prueba {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a;
        double f;
        System.out.println("Ingrese un numero");
        a = scan.nextInt();
        System.out.println("Intervalo");
        f = scan.nextDouble();
        double c = Math.tan(Math.toRadians(a));
        double b = (9.81 * Math.sin(Math.toRadians(a))) - (f * 9.81 * Math.cos(Math.toRadians(a)));
        
        
        if (f > c) {
            System.out.println("" + 0);
        }else{
            System.out.println(b);
        }
        
        
    }
    
}
