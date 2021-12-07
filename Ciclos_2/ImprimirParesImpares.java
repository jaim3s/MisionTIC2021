/**
 * Imprimir los numeros del 1 al 999 impares y del 2 al 100 pares.
 */
class ImprimirParesImpares{
    public static void main(String[] args){
        listado();        
    }

    /**
     * Imprimir los numeros del 1 al 999 impares y del 2 al 100 pares.
     *
     * @return void.
     */
    public static void listado(){

        for(int i = 1; i < 1000; i+=2){
            System.out.println(i);
        }
        for(int i = 2; i < 1001; i+=2){
            System.out.println(i);
        }
    }
}