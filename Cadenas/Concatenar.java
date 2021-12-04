import java.util.Scanner;        

/**
 * Concatenar dos cadenas de caracteres.
 */
class Concatenar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar primera cadena de caracteres: ");
        String str1 = sc.nextLine();

        System.out.println("Insertar segunda cadena de caracteres: ");
        String str2 = sc.nextLine();

        String res = concatenar(str1, str2);
        System.out.println(res);
    }


    /**
     * Concatenar dos cadenas de caracteres.
     * 
     * @param str1 primera cadena 
     * @param str2 seugnda cadena 
     *
     * @return retornar un String con la cadenas concatenadas.
     */
    public static String concatenar(String str1, String str2){
        return str1 + str2;
    }
}