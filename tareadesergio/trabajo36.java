package tareadesergio;

import java.util.Scanner;

public class trabajo36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        double costo, descuento, pago_por_todo, precio;
        pago_por_todo = 0;
        System.out.print("Ingresa el valor de N: ");
        n = sc.nextInt();
        sc.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("\n***********");
            System.out.print("\nIngrese el valor del precio : ");
            precio = sc.nextDouble();
            sc.nextLine();
            descuento=precio*0.1;
            if(precio>=200)
                descuento=precio*0.15;
            if(precio>100&&precio<200)
                descuento=precio*0.12;
            costo=precio-descuento;
            pago_por_todo=pago_por_todo+costo;
            System.out.println("Valor de costo: " + costo);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println();
            sc.close();
        }
        System.out.println("Valor de pago por todo: " + pago_por_todo);
        
    }

}
