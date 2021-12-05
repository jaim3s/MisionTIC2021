import java.util.Scanner;

/**
 * Mover todos los ceros de un arreglo a la derecha.  
 */
class CerosDerecha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la longitud del primer arreglo de reales: ");
        int n = sc.nextInt();

        double[] arr = new double[n]; 
        rellenar(arr, n, sc);

        moverCeros(arr, n);
        
        imprimirArreglo(arr, n);
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
     * Mover todos los ceros de un arreglo a la derecha.  
     *
     * @param arr arreglo de numeros reales
     * @param n longitud del arreglo 
     *
     * @return void.    
     */
    public static void moverCeros(double[] arr, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-1; j++){
                if (arr[j] == 0){
                    double b = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = b;
                }
            }
        }
    }
}