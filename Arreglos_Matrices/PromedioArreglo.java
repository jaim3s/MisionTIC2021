import java.util.Scanner;

/**
 * Hallar el promedio de un arreglo de numeros reales. 
 */
class PromedioArreglo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del arreglo de reales: ");
        int n = sc.nextInt();

        double[] arr = new double[n]; 
        rellenar(arr, n, sc);

        System.out.println(promedio(arr, n));

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
     * Promedio de un arreglo con numeros reales.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     *
     * @return promedio del arreglo de numeros reales.
     */
    public static double promedio(double[] arr, int n){
        double cnt = 0.0;
        for (int i = 0; i < n; i++){
            cnt += arr[i];
        }
        return cnt/n;
    }
}