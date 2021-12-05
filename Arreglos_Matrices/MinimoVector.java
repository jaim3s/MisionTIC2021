import java.util.Scanner;

/**
 * Hallar el minimo elemento dentro de un vector.
 */
class MinimoVector{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del vector de reales: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        rellenar(arr, n, sc); 

        System.out.println(hallarMinimo(arr, n));
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
     * Hallar el minimo de un vector.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     *
     * @return minimo del vector. 
     */
    public static double hallarMinimo(double[] arr, int n){
        double min = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] <= min){
                min = arr[i];
                index = i;
            }
        }

        return min;          
    }
}