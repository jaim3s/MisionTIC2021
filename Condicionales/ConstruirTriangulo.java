import java.util.Scanner;

/**
 * Determinar si dadas tres longitudes se puede construir un triangulo.
 */
class ConstruirTriangulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar longitud a del triangulo: ");
        double a = sc.nextDouble();

        System.out.println("Insertar longitud b del triangulo: ");
        double b = sc.nextDouble();        

        System.out.println("Insertar longitud c del triangulo: ");
        double c = sc.nextDouble();

        System.out.println(esTriangulo(a, b, c));

    }

    /**
     * Determinar si dadas tres longitudes se puede construir un triangulo.
     *
     * @param a numero real representando la longitud de un triganulo
     * @param b numero real representando la longitud de un triganulo
     * @param c numero real representando la longitud de un triganulo
     *
     * @return retornar true si se puede construir un triangulo dada las longitudes de otra
     * manera false.
     */
    public static boolean esTriangulo(double a, double b, double c){
        int cnt = 0;
        if (a + b > c){
            cnt++;
        }
        if (a + c > b){
            cnt++;
        }
        if (b + c > a){
            cnt++;
        }
        return cnt == 3;
    }

}