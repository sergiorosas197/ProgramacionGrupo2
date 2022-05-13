package ExamenSLRJ;

import java.util.Scanner;

public class Pregunta2SLRJ {
    public static void main(String[] args) {
        static Scanner teclado=new Scanner(System.in);
        int n1;
        int resul;
        System.out.println("Ingrese monto");
        n1 =  teclado.nextInt();
        if (n1>=2000) {
            resul = (n1-(n1*0.1));
        } else {
            if (n1>=1000) {
                resul = n1-(n1*0.05);
            } else {
                if (n1>=500) {
                    resul = n1-(n1*0.02);
                } else {
                    resul = n1;
                }
            }
        }
        System.out.println("el monto con descuento es "+resul);
    }
    
    
    }
        
    }
    
}
