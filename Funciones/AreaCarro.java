import java.util.Scanner;

/**
 * Calcula el area lateral del carro.
 */
class AreaCarro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar el radio de la primera llanta: ");
        double r1 = sc.nextDouble();
        System.out.println("Por favor insertar el radio de la segunda llanta: ");
        double r2 = sc.nextDouble();
        System.out.println("Por favor insertar el largo del primer rectangulo: ");
        double b1 = sc.nextDouble();
        System.out.println("Por favor insertar el ancho del primer rectangulo: ");
        double a1 = sc.nextDouble();
        System.out.println("Por favor insertar el largo del segundo rectangulo: ");
        double b2 = sc.nextDouble();
        System.out.println("Por favor insertar el ancho del segundo rectangulo: ");
        double a2 = sc.nextDouble();

        System.out.println(area(r1, r2, b1, a1, b2, a2));
    }

    /**
     * Determinar el area de un circulo
     *
     * @param r radio del circulo
     *
     * @return retornar el area del circulo
     */
    public static double area_circulo(double r){
        return Math.PI*Math.pow(r, 2);
    }

    /**
     * Determinar el area de un rectangulo
     *
     * @param b largo del rectangulo
     * @param a ancho del rectangulo
     *
     * @return retornar el area del rectangulo
     */
    public static double area_rectangulo(double b, double a){
        return a*b;
    } 

    /**
     * Determina el area lateral del carro
     * 
     * @param r1 radio de la primera llanta
     * @param r2 radio de la segunda llanta
     * @param b1 largo del primer rectangulo
     * @param a1 ancho del primer rectangulo
     * @param b2 largo del segundo rectangulo
     * @param a2 ancho del segundo rectangulo
     *
     * @return retorna el area lateral como un double.
     */
    public static double area(double r1, double r2, double b1, double a1, double b2, double a2){
        return area_circulo(r1) + area_circulo(r2) + area_rectangulo(b1, a1) + area_rectangulo(b2, a2); 
    }
}