import java.util.Scanner;

/**
 * Hallar el producto punto de dos arreglos de numeros reales. 
 */
class ProductoPunto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del primer arreglo de reales: ");
        int n = sc.nextInt();

        double[] arr1 = new double[n]; 
        rellenar(arr1, n, sc);

        System.out.println("Insertar la longitud del segundo arreglo de reales: ");
        int m = sc.nextInt();

        double[] arr2 = new double[m]; 
        rellenar(arr2, m, sc);
        
        System.out.println(productoPunto(arr1, arr2, n, m));
    }

    /**
     * Rellanar un arreglo con numeros reales.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     * @param sc objeto scanner
     *
     * @return void.
     */
    public static void rellenar(double[] arr, int n, Scanner sc){
        for (int i = 0; i < n; i++){
            System.out.printf("%d: ", i);
            double k = sc.nextDouble();
            arr[i] = k;
        }
    }

    /**
     * Hallar el producto punto de dos arreglos con numeros reales.
     *
     * @param arr1 arreglo de numeros reales
     * @param arr2 arreglo de numeros reales
     * @param n longitud del arr1
     * @param m longitud del arr2
     *
     * @return producto punto de dos arreglos de numeros reales.
     */
    public static double productoPunto(double[] arr1, double[] arr2, int n, int m){
        double cnt = 0.0;
        for (int i = 0; i < n; i++){
            cnt += arr1[i]*arr2[i];
        }
        return cnt;
    }
}