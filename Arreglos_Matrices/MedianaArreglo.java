import java.util.Scanner;

/**
 * Hallar la mediana de un arreglo de numeros reales. 
 */
class MedianaArreglo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del arreglo de reales: ");
        int n = sc.nextInt();

        double[] arr = new double[n]; 
        rellenar(arr, n, sc);

        ordenar(arr, n);

        System.out.println(mediana(arr, n));
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
     * Ordenar el arreglo con numeros reales.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     *
     * @return void.
     */
    public static void ordenar(double[] arr, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    double b = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = b;
                }
            }
        }
    }

    /**
     * Hallar la media de un arreglo con numeros reales.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     *
     * @return mediana del arreglo dependiendo de su tamano.
     */
    public static double mediana(double[] arr, int n){
        if (n % 2 == 0){
            return (arr[((n-1)/2)] + arr[((n+1)/2)])/2.0;
        }else{
            return arr[n/2];
        }
    }
}