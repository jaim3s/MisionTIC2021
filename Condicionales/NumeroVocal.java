import java.util.Scanner;

/**
 * Determinar si un numero entero corresponde a una vocal minuscula.
 */
class NumeroVocal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar el numero entero: ");
        int n = sc.nextInt();

        System.out.println(esVocalMinuscula(n));
    }

    /**
     * Determinar si un numero entero corresponde a una vocal minuscula
     *
     * @param n numero entero
     *
     * @return retorna true si un numero entero corresponde a una vocal minuscula de otra
     * manera retorna false 
     */
    public static boolean esVocalMinuscula(int n){
        boolean value = false; 
        switch(n){
            case 97:
                value = true;
                break;
            case 101:
                value = true;
                break;
            case 105:
                value = true;
                break;            
            case 111:
                value = true;
                break;            
            case 117:
                value = true;
                break;   
        }

        return value;
    }

}