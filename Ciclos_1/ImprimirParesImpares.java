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
     * @return void 
     */
    public static void listado(){

        int i = 1;
        while(i < 1000){
            System.out.println(i);
            i += 2;
        }
        i = 2;
        while(i < 1001){
            System.out.println(i);
            i += 2;
        }
    }
}