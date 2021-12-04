import java.util.Scanner;        

/**
 * Contar las ocurrencias de una letra dentro de una cadena. 
 */
class Ocurrencias{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar cadena de caracteres: ");
        String str = sc.nextLine();

        System.out.println("Insertar caracter: ");
        char c = sc.next().charAt(0);

        System.out.println(contar(str, c));
    }

    /**
     * Contar las ocurrencias de una letra dentro de una cadena.
     *
     * @param str cadena de caracteres
     * @param c letra a contar
     *
     * @return retorna el numero de veces que se encuentra el caracter dentro de la cadena.
     */
    public static int contar(String str, char c){
        int cnt = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                cnt++;
            }
        }
        return cnt;
    }
}
