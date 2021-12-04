import java.util.Scanner;        

/**
 * Determinar si dos cadenas son exactamente iguales. 
 */
class CadenasIguales{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar primera cadena de caracteres: ");
        String str1 = sc.nextLine();

        System.out.println("Insertar segunda cadena de caracteres: ");
        String str2 = sc.nextLine();

        System.out.println(igual(str1, str2));
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