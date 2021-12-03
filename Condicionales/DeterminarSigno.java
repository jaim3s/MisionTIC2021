import java.util.Scanner;

/**
 * Determinar si un numero es positivo negativo o cero.
 */
class DeterminarSigno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar el numero real: ");
        double x = sc.nextDouble();

        System.out.println(signo(x));
    }

    /**
     * Determinar si un numero real es positivo negativo o cero.
     *
     * @param x numero real
     *
     * @return retornar si un numero es positivo negativo o cero.
     */
    public static String signo(double x){
        if (x > 0){
            return "El numero " + x + " es positivo";
        }else if (x < 0){
            return "El numero " + x + " es negativo"; 
        }else{
            return "El numero " + x + " es el neutro para la suma";
        }
    }

}