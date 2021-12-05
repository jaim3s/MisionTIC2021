import java.util.Scanner;

/**
 * Hallar la posicion del minimo elemento dentro de un vector.
 */
class PosicionMinimoVector{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del vector de reales: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        rellenar(arr, n, sc); 

        System.out.println(posicionMinimo(arr, n));
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
     * Hallar la posicion del minimo elemento de un vector.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     *
     * @return posicion dle minimo del vector. 
     */
    public static int posicionMinimo(double[] arr, int n){
        double min = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] <= min){
                min = arr[i];
                index = i;
            }
        }

        return index;      
    }
}