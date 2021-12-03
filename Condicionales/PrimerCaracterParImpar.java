import java.util.Scanner;

/**
 * Determinar si el primer caracter de una cadena es par o impar en el codigo ASCII.
 */
class PrimerCaracterParImpar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar la cadena de longitud 1: ");
        String str = sc.nextLine();

        System.out.println(esParImpar(str));
    }

    /**
     * Determinar si el primer caracter de una cadena es par o impar en el codigo ASCII
     *
     * @param str cadena de longitud 1
     *
     * @return retorna true si el caracter corresponde a un numero par de otra manera
     * retorna false 
     */
    public static boolean esParImpar(String str){
        int ascii = str.charAt(0);
        System.out.println(ascii);
        return ascii % 2 == 0;
    }

}