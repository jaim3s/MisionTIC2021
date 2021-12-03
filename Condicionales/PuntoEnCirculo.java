import java.util.Scanner;

/**
 * Determinar si un punto esta en un circulo.
 */
class PuntoEnCirculo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar el componente h del centro del circulo: ");
        double h = sc.nextDouble();

        System.out.println("Insertar el componente k del centro del circulo: ");
        double k = sc.nextDouble();

        System.out.println("Insertar el radio del circulo: ");
        double r = sc.nextDouble();

        System.out.println("insertar el componente x del punto: ");
        double x = sc.nextDouble();

        System.out.println("insertar el componente y del punto: ");
        double y = sc.nextDouble();

        System.out.println(dentroCirculo(h, k, x, y, r));
    }

    /**
     * Determinar si un punto esta dentro del circulo.
     *
     * @param x numero real representando componente x del punto 
     * @param y numero real representando componente y del punto 
     *
     * @return retornar true si esta dentro de otra manera false.
     */
    public static boolean dentroCirculo(double h, double k, double x, double y, double r){
        double eval = Math.pow(x - h, 2) + Math.pow(y - k, 2);
        return eval <= Math.pow(r, 2);
    }

}