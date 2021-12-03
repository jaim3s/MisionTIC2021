import java.util.Scanner;

/**
 * Determinar el numero de contagios en NuncaLandia.
 */
class ContagiosNuncaLandia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor insertar cantidad de dias: ");
        int d = sc.nextInt();
        System.out.println("Por favor insertar numero de contagiados actuales: ");
        int c = sc.nextInt();

        System.out.println(contagiados(d, c));
    }

    /**
     * Determina el total de contagiados despues de d dias
     * 
     * @param d cantidad de dias
     * @param c numero de contagiados actuales   
     *
     * @return retorna el total de contagiados despues de d dias.
     */
    public static int contagiados(int d, int c){
        if (d > 0){
            return c * (int) Math.pow(2, d) + contagiados(d-1, c);
        }
        return c;
    }

}