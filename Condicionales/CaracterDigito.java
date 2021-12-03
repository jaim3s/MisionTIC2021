import java.util.Scanner;

/**
 * Determinar si un caracter corresponde a un digito.
 */
class CaracterDigito{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar el caracter: ");
        char c = sc.next().charAt(0);

        System.out.println(esDigito(c));
    }

    /**
     * Determinar si un caracter corresponde a un digito.
     *
     * @param c caracter
     *
     * @return retorna true si un caracter corresponde a un digito de otra manera
     * retorna false 
     */
    public static boolean esDigito(char c){
        boolean value = false; 
        switch(c){
            case '0':
                value = true;
                break;
            case '1':
                value = true;
                break;
            case '2':
                value = true;
                break;            
            case '3':
                value = true;
                break;            
            case '4':
                value = true;
                break;   
            case '5':
                value = true;
                break;   
            case '6':
                value = true;
                break;            
            case '7':
                value = true;
                break;            
            case '8':
                value = true;
                break;   
            case '9':
                value = true;
                break;     
        }

        return value;
    }

}