import java.util.Scanner;

/**
 * Hallar el producto entre un escalar y un vector.
 */
class ProductoEscalar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del vector de reales: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        rellenar(arr, n, sc); 

        System.out.println("Insertar el escalar: ");
        double k = sc.nextDouble();

        imprimirArreglo(productoEscalar(arr, n, k), n);
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
     * Imprimir los numeros del arreglo.
     * 
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     *
     * @return void.
     */
    public static void imprimirArreglo(double[] arr, int n){
        for (int i = 0; i < n; i++){
            System.out.printf("%f ", arr[i]);
        }
    }

    /**
     * Hallar el producto entre un escalar y un vector.
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo
     * @param k numero real representando escalar
     *
     * @return vector resultante del producto entre un vector y un escalar. 
     */
    public static double[] productoEscalar(double[] arr, int n, double k){

        double[] nuevoArr = new double[n];

        for (int i = 0; i < n; i++){
            nuevoArr[i] = arr[i] * k;
        }

        return nuevoArr;          
    }
}