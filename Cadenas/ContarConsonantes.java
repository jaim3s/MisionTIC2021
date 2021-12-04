import java.util.Scanner;        

/**
 * Contar las consonantes en una cadena. 
 */
class ContarConsonantes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar cadena de caracteres: ");
        String str = sc.nextLine();

        System.out.println(contar(str));
    }

    /**
     * Contar las consonantes en una cadena.  
     *
     * @param str cadena de caracteres
     *
     * @return retornar el numero de consonantes en una cadena.
     */
    public static int contar(String str){
        int cnt = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isLetter(str.charAt(i)) && !esVocal(str.charAt(i))){
                cnt++;
            }
        }
        return cnt; 
    }

    public static boolean esVocal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
