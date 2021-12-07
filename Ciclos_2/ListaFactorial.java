import java.util.Scanner;

/**
 * Imprimir los numeros del 1 a n y al lado su factorial.
 */
class ListaFactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar numero de parada: ");
        int n = sc.nextInt();

        listado(n);        
    }

    /**
     * Imprimir los numeros del 1 a n y al lado su factorial.
     *
     * @param n numero de parada
     *
     * @return void.
     */
    public static void listado(int n){

        for(int i = 1; i <= n; i++){
            System.out.printf("%d | %d\n", i, factorial(i));
        }
    }

    /**
     * Hallar el factorial de un numero.
     *
     * @param n numero a hallar factorial
     *
     * @return factorial del numero.
     */
    public static int factorial(int n){
        int fact = 1;
        for (int i = n; i > 1; i--){
            fact *= i;
        }
        return fact;
    }
}