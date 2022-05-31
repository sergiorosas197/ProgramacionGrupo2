package recursividad;

public class EjemploRecursividad {

    public static int factorial(int n) {
        if (n>1) {
            return factorial(n-1)*n;
        }
        return 1;
    }

    public static int fibonacciR(int n) {
        if (n>1) {
            return fibonacciR(n-1)+fibonacciR(n-2);
        }
        return n;
    }

    public static int sumaR(int n) {
        if(n==1) {
            return sumaR(n-1)+n;

        }
    }
    public static int potenciaR(int n) {
        if (n==1) {
    
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println("fibonacci:");
        System.out.println(fibonacciR(6));
        System.out.println(sumaR(100));
    }
}