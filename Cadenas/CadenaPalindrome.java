import java.util.Scanner;        

/**
 * Determinar si una cadena de caracteres es palindrome.
 */
class CadenaPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar primera cadena de caracteres: ");
        String str = sc.nextLine();

        String strInvertido = invertir(str);

        System.out.println(igual(str, strInvertido));
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

    /**
     * Determinar si dos cadenas son exactamente iguales. 
     *
     * @param str1 primera cadena 
     * @param str2 seugnda cadena 
     *
     * @return retornar true si ambas cadenas son iguales de otra manera false
     */
    public static boolean igual(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}