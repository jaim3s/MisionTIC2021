import java.util.Scanner;

/**
 * Determinar el saldo despues de comprar insumos.
 */
class Saldo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar el numero de panes: ");
        int p = sc.nextInt();
        System.out.println("Por favor insertar el numero de bolsas de leche: ");
        int m = sc.nextInt();
        System.out.println("Por favor insertar el numero de huevos: ");
        int h = sc.nextInt();
        System.out.println("Por favor insertar el billete: ");
        int b = sc.nextInt();

        System.out.println(saldo(p, m, h, b));
    }

    /**
     * Determinar el saldo despues de compara los insumos necesarios.
     *
     * @param p numero de panes
     * @param m numero de bolsas de leches
     * @param h numero de huevos
     * @param b billete
     *
     * @return retornar el saldo despues de pagar con el billete.
     */
    public static int saldo(int p, int m, int h, int b){
        int pagar = p*300 + m*3300 + h*350;
        return b-pagar;
    }
}