import java.util.Scanner;

/**
 * Hallar la potencia n de x.
 */
class FuncionPotencia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar potencia n: ");
        int n = sc.nextInt();

        System.out.println("Insertar numero real x: ");
        double x = sc.nextDouble();

        System.out.println(potencia(x, n)); 
    }

    /**
     * Hallar la potencia n de x.
     *
     * @param n numero potencia
     * @param x numero real (base)
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