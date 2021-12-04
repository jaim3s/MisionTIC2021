import java.util.Scanner;        

/**
 * Determinar si todos los caracteres de una cadena son alfabeticos. 
 */
class SimbolosCadena{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar cadena de caracteres: ");
        String str = sc.nextLine();

        System.out.println(alfabeto(str));
    }

    /**
     * Determinar si todos los caracteres de una cadena son alfabeticos. 
     *
     * @param str cadena de caracteres
     *
     * @return retorna true si todos los caracteres de una cadena son alfabeticos de otra
     * manera false
     */
    public static boolean alfabeto(String str){
        int cnt = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
                cnt++;
            }
        }
        return cnt == str.length(); 
    }
}
