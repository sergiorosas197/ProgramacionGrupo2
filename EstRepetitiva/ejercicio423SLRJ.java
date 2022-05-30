package EstRepetitiva;

import java.util.Scanner;

public class ejercicio423SLRJ {
    public static void main(String[] args) {
        
        int contador = 160;
        for(int i = 160; i <= 320; i++) {
            if(i % 20 == 0){
                contador++;
            }
        }
        System.out.println(contador);
    }

    
}

