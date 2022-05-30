package EstRepetitiva;

import java.util.Scanner;

public class ejercicio426SLRJ {

    static Scanner it=new Scanner(System.in);
    public static void MostColumnaselcuadradoyelcubo() {
        System.out.println("Introduzca un numero:");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());

        System.out.println("  n   |   n²   |   n³");
        System.out.println("Introduce el numero a saber: ");
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++)  {
            System.out.printf("%5d |%8d |%9d\n", i, i * i,i * i * i);
        }
        System.out.println("mostrar en tres columnas , el cuadrado y el cubo del los numeros: ");
    }
     public static void main(String[] args) {
        MostColumnaselcuadradoyelcubo();
     }

    
}