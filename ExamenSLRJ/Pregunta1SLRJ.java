package ExamenSLRJ;

import java.util.Scanner;

/**
 * Pregunta1SLRJ
 */
public class Pregunta1SLRJ {
    static Scanner lt = new Scanner(System.in);
    public static void main(String[] args) {
    
    public static Void Pregunta1SLRJ () {
        //Declarar variables
        int nota;
        double nivel;
        String promediofin;
        promediofin=(nota1*0.40+nota2*0.35+nota3*0.25);
        //Datos de entrada
        System.out.println("Ingrese la nota:");
        nota=lt.nextInt();
        System.out.println("ingrese el promedio:");
        nivel=lt.nextDouble();
        //Proceso
        if (nota>=17) {
            if (nivel=4) {
                promediofin="Le corresponde ser nivel 4";
            }else if (promediofin<=20 && promediofin>=17) {
                promediofin="Le corresponde el nivel 3";
            }else if (promediofin<=16 && promediofin>=14) {
                promediofin="Le corresponde el nivel 2";
            }else if (promediofin<=13 && promediofin>=11) {
                promediofin="Le corresponde el nivel 1";
            else if (promediofin<=10 && promediofin>=0) {
            }else {
                promediofin="Pierde la vacante";
            //Datos de salida
            System.out.println("El promedio final del estudiane es: "+promediofin);
            }
            
        }
    }
        
    }

}