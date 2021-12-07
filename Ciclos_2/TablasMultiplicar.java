/**
 * Mostrar las tablas de multiplicar del 1 al 9.
 */
class TablasMultiplicar{
    public static void main(String[] args){
        tablas(); 
    }

    /**
     * Mostrar las tablas de multiplicar del 1 al 9.
     *
     * @return void.
     */
    public static void tablas(){

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
    }
}