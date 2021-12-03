import java.util.Scanner;

/**
 * Calcula el volumen del solido.
 */
class VolumenSolido{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar la altura del cono: ");
        double h = sc.nextDouble();
        System.out.println("Por favor insertar el radio del cono: ");
        double r2 = sc.nextDouble();
        System.out.println("Por favor insertar el radio de la esfera: ");
        double r1 = sc.nextDouble();
        
        System.out.println(volumen(h, r1, r2));
    }

    /**
     * Determina el volumen total del solido
     * 
     * @param h altura del cono 
     * @param r1 radio de la esfera
     * @param r2 radio del cono
     *
     * @return retorna el volumen total como un double.
     */
    public static double volumen(double h, double r1, double r2){
        return (4.0/3)*Math.PI*Math.pow(r1, 3) + Math.PI*Math.pow(r2, 2)*(h/3);
    } 
}