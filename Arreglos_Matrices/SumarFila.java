import java.util.Scanner;

/**
 * sumar una fila dada de una matrix de numeros reales.  
 */
class SumarFila{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[][] matrix = input(sc);

        System.out.println("Seleccionar fila a sumar: ");
        int n = sc.nextInt();

        System.out.println(sumarFila(matrix, n));
    }

    /**
     * Insertar numero de filas y columnas dentro de la matrix y rellenar.
     *
     * @param sc Scanner object
     *
     * @return matrix de numeros reales.
     */
    public static double[][] input(Scanner sc){
        System.out.println("Insertar el numero de filas de la matrix de reales: "); 
        int n = sc.nextInt();
        System.out.println("Insertar el numero de columnas de la matrix de reales: "); 
        int m = sc.nextInt();

        double[][] matrix = new double[n][m];
        rellenar(matrix, n, m, sc);
        return matrix;
    }

    /**
     * Rellanar una matrix con numeros reales.
     *
     * @param matrix matrix de numeros reales
     * @param n numero de filas de la matrix
     * @param m numero de columnas de la matrix
     * @param sc objeto scanner
     *
     * @return void.
     */
    public static void rellenar(double[][] matrix, int n, int m, Scanner sc){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.printf("[%d][%d]: ", i, j);
                double k = sc.nextDouble();
                matrix[i][j] = k;
            }
        }
    }


    /**
     * Hallar la suma de una fila dada de una matrix de numeros reales.
     * 
     * @param matrix matrix de numeros reales
     * @param m indice de la fila a sumar
     *
     * @return suma total de los elementos de una fila.
     */
    public static double sumarFila(double[][] matrix, int n){

        double cnt = 0.0;

        for (int j = 0; j < matrix[0].length; j++){
            cnt += matrix[n][j];
        }
        
        return cnt;
    }
}