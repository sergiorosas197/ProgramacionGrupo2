package reforzamiento2022;

import java.util.Scanner;

public class Ejercicio1{
    static Scanner leerT=new Scanner(System.in);
    //Pregunta 01 Reforzamiento
    public static void serieFibonaci() {
        int nI=0, nS=1, nT;
        System.out.println("Introduce el N numero:");
        int n=leerT.nextInt();
        System.out.println(nI);
        int cont=1;
        while (cont<n) {  
            System.out.println(nS);              
            nT=nS+nI;                        
            nI=nS;
            nS=nT;    
            cont++;        
        }   
    }


    public static void fibonaciN() {
           int nI=0, nS=1, nT;
           System.out.println("Introduce  un numero:");
           int n=leerT.nextInt();
           int cont=1;
           if(n>1){
               while (cont<n) {
                   nT=nS+nI;
                   nI=nS;
                   nS=nT;    
                   cont++;            
               }
           }else{nS=n;}
           System.out.println("el factorial de "+n+" es:"+nS);
       }
       

    public static void siNumeroPrimo() {
       System.out.println("Ingrese un numero:");
       int num=leerT.nextInt();
       int cont=1;
       int cantDiv=0;
       while (cont<=num) {
           if (num%cont==0) {
               cantDiv++;
           }
           cont++;
       }
       if (cantDiv==2) {
           System.out.println("El numero "+num+" es primo");
       } else {
           System.out.println("El numero "+num+" no es primo");
       }
    }

    public static void numerosprimos() {
        System.out.println("Ingrese el limite maximo:");
        int num=leerT.nextInt();
        int numX=1;
        while (numX<=num){
            int cantDiv=0;
            int cont=1;
            while (cont<=numX) {
                if (cantDiv>2) break;
                if (numX%cont==0) {
                    cantDiv++;//2
                }
                cont++;//4
            }
            if (cantDiv==2) {
                System.out.println(numX);
            }
            numX=numX+1;
        }
    }
public static void main(String[] args) {
       //serieFibonaci();
       //fibonaciN();
       numerosprimos();
    } 
}
