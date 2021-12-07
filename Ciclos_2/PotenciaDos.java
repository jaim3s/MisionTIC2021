import java.util.Scanner;

/**
 * Hallar la potencia n de 2.
 */
class PotenciaDos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar potencia n: ");
        int n = sc.nextInt();

        System.out.println(potencia(n)); 
    }

    /**
     * Hallar la potencia n de 2.
     *
     * @param n numero potencia
     *
     * @return valor de la potencia n evaluada en 2.
     */
    public static int potencia(int n){
        int cnt = 1;
        for(int i = 0; i < n; i++){
            cnt *= 2; 
        }
        return cnt;
    }
}