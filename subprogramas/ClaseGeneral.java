package subprogramas;

import java.util.Scanner;

public class ClaseGeneral {

    static Scanner leerT=new Scanner(System.in);
    static aritmetica obj=new aritmetica();
    static Persona objP=new Persona();


    public static void main(String[] args) {
        System.out.println("Ingrese el Primer Valor:");
        int aX=leerT.nextInt();
        System.out.println("Ingrese el Segundo Valor:");
        int bX=leerT.nextInt();        
        int result=obj.sumar(aX, bX);
        System.out.println("La Suma es:"+result);
        System.out.println("Ingrese su nombre:");
        objP.nombre="Sergio ";
        System.out.println("Ingrese su DNI:");
        objP.dni="";
        System.out.println("Ingrese una comida:");
        
        objP.comer(leerT.next());

    }

}