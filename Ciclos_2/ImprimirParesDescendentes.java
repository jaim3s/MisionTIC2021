import java.util.Scanner;

/**
 * Imprimir los numeros pares en forma descendente hasta 2 que son menores a un numero
 * dado.
 */
class ImprimirParesDescendentes{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insertar el numero de inicializacion: ");
        int n = sc.nextInt();

        listado(n);        
    }

    /**
     * Imprimir los numeros pares en forma descendente hasta 2 que son menores a un numero
     * dado.
     *
     * @return void.
     */
    public static void listado(int n){

        for(int i = n; i >= 2; i--){
            System.out.println(i);
        }
    }
}