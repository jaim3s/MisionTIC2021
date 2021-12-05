import java.util.Scanner;

/**
 * Sumar dos matrices de numeros reales.  
 */
class SumarMatrices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[][] matrix1 = input(sc);
        double[][] matrix2 = input(sc);

        double[][] matrix3 = sumarMatrices(matrix1, matrix2);
        
        imprimirArreglo(matrix3);
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
     * Imprimir los numeros de la matrix.
     * 
     * @param matrix matrix de numeros reales
     * 
     * @return void.
     */
    public static void imprimirArreglo(double[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.printf("%f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Hallar la suma de dos matrices de numeros reales.
     * 
     * @param matrix1 matrix de numeros reales
     * @param matrix2 matrix de numeros reales
     *
     * @return matrix con la suma de las dos matrices pasadas como parametros.
     */
    public static double[][] sumarMatrices(double[][] matrix1, double[][] matrix2){
        int n = matrix1.length;
        int m = matrix1[0].length;

        double[][] matrix3 = new double[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }
}