import java.util.Scanner;

/**
 * Calcular la cantidad de carne de aves en kilos. 
 */
class KilosCarne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar el numero de gallinas: ");
        int n = sc.nextInt();
        System.out.println("Por favor insertar el numero de gallos: ");
        int m = sc.nextInt();
        System.out.println("Por favor insertar el numero de pollitos: ");
        int k = sc.nextInt();

        System.out.println(cantidadCarne(n, m, k));
    }

    /**
     * Determinar el los kilos de carne.
     *
     * @param n numero de gallinas
     * @param m numero de gallos
     * @param k numero de pollitos
     *
     * @return retornar los kilos de carne.
     */
    public static int cantidadCarne(int n, int m, int k){
        return n*6 + m*7 + k*1;
    }
}