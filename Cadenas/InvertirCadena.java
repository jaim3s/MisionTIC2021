import java.util.Scanner;        

/**
 * Invertir una cadena de caracteres.
 */
class InvertirCadena{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar primera cadena de caracteres: ");
        String str = sc.nextLine();

        String res = invertir(str);
        System.out.println(res);
    }


    /**
     * Invertir una cadena de caracteres.
     * 
     * @param str cadena de caracteres
     *
     * @return retornar un String con la cadena invertida.
     */
    public static String invertir(String str){
        String res = "";

        for (int i = str.length()-1; i >= 0; i--){
            res += str.charAt(i);
        }

        return res;
    }
}