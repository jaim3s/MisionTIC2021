import java.util.Scanner;

/**
 * Determinar lo que debe pagar despues de un prestamo.
 */
class DebePagar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar cantidad del prestamo: ");
        double p = sc.nextDouble();

        System.out.println(pagar(p));
    }

    /**
     * Determina el total a pagar despues de dos meses
     * 
     * @param p cantidad del prestamo
     *
     * @return retorna el total a pagar luego de dos meses.
     */
    public static double pagar(double p){
        return p*Math.pow(1.03, 2);
    }

}