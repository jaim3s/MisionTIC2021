import java.util.Scanner;

/**
 * Calcula el area lateral del vagon.
 */
class AreaVagon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar el radio de las llantas: ");
        double r = sc.nextDouble();
        System.out.println("Por favor insertar el largo del vagon: ");
        double b = sc.nextDouble();
        System.out.println("Por favor insertar el ancho del vagon: ");
        double a = sc.nextDouble();

        System.out.println(area(r, a, b));
    }

    /**
     * Determina el area lateral del vagon
     * 
     * @param r radio de las llantas
     * @param a ancho del vagon
     * @param b largo del vagon
     *
     * @return retorna el area lateral como un double.
     */
    public static double area(double r, double a, double b){
        return 2*Math.PI*Math.pow(r, 2) + a*b;
    }
}