import java.util.Scanner;

/**
 * Determinar si una matrix es magica.
 */
class MatrixMagica{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[][] matrix = input(sc);

        System.out.println(matrixMagica(matrix));
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
     * Hallar la suma de una columna dada de una matrix de numeros reales.
     * 
     * @param matrix matrix de numeros reales
     * @param m indice de la columna a sumar
     *
     * @return suma total de los elementos de una columna.
     */
    public static double sumarColumna(double[][] matrix, int m){

        double cnt = 0.0;

        for (int i = 0; i < matrix.length; i++){
            cnt += matrix[i][m];
        }
        
        return cnt;
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


    /**
     * Hallar la suma de una fila dada de una matrix de numeros reales.
     * 
     * @param matrix matrix de numeros reales
     * @param m indice de la fila a sumar
     *
     * @return suma total de los elementos de una fila.
     */
    public static boolean matrixMagica(double[][] matrix){

        double mainDiag = 0.0;
        double secondDiag = 0.0;
        double totalFila = 0.0;

        // Sumar columnas y filas y comparar si son iguales
        for (int i = 0; i < matrix.length; i++){
            totalFila = sumarFila(matrix, i);
            for (int j = 0; j < matrix.length; j++){
                if (totalFila != sumarColumna(matrix, j)){
                    return false;
                }
            }

            mainDiag += matrix[i][i]; 
            int col = (matrix.length-1) - i;
            secondDiag  += matrix[i][col];
        }

        if ((mainDiag == secondDiag) && (mainDiag == totalFila)){
            return true;
        }
        return false;
    }
}