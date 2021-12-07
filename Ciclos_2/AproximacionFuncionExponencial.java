import java.util.Scanner;

/**
 * Aproximacion de funcion exponencial con series de Maclaurin alrededor de 0.
 */
class AproximacionFuncionExponencial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar primeros n terminos de la sucesion: ");
        int n = sc.nextInt();

        System.out.println("Insertar numero real x: ");
        double x = sc.nextDouble();

        System.out.println(exponente(x, n));

    }

    /**
     * Aproximacion de funcion exponencial con series de Maclaurin alrededor de 0.
     *
     * @param x numero real (base)
     * @param n numero potencia
     *
     * @return la sumatoria de la sucesion de Maclaurin.
     */
    public static double exponente(double x, int n){
        double cnt = 0;
        for (int i = 0; i <= n; i++){
            cnt += potencia(x, i)/factorial(i);
        }
        return cnt;
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

    /**
     * Hallar la potencia n de x.
     *
     * @param x numero real (base)
     * @param n numero potencia
     *
     * @return valor de la potencia n evaluada en x.
     */
    public static double potencia(double x, int n){
        double cnt = 1;
        for(int i = 0; i < n; i++){
            cnt *= x; 
        }
        return cnt;
    }
}