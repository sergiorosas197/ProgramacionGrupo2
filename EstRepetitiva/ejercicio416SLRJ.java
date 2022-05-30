package EstRepetitiva;

import java.util.Scanner;

public class ejercicio416SLRJ {
    static Scanner it=new Scanner(System.in);
    public static void MostMultiplicacion() {

        System.out.println("Introduzca un numero:");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());

        System.out.println("  n  |  n*2  | n*3 | n*4 | n*5 | n*6 | n*7 | n*8 | n*9 |n*10  ");
        System.out.println("Introduce el numero a saber: ");
        for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++)  {
            System.out.printf("%5d |%8d |%9d\n", i, i * i,i * i * i);
        }
        System.out.println("mostrar en columnas el cubo del numero: ");
    }

     public static void main(String[] args) {
        MostMultiplicacion();
     }

    
}