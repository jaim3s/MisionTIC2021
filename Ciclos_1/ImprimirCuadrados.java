/**
 * Imprimir los numeros del 1 al 100 y al lado su cuadrado.
 */
class ImprimirCuadrados{
    public static void main(String[] args){
        listado();        
    }

    /**
     * Imrimir listado de numeros del 1 al 100 y al lado su cuadrado
     *
     * @return void 
     */
    public static void listado(){
        int i = 1;
        while (i < 101){
            System.out.printf("%d | %d\n", i, (int) Math.pow(i, 2));
            i++;
        }
    }
}