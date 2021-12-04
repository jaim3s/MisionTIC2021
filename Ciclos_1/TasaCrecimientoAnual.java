/**
 * Determinar en que la poblacion del pais B supera la poblacion del pais A.
 */
class TasaCrecimientoAnual{
    public static void main(String[] args){

        double pobA = 25e6;
        double pobB = 189e5;
        int ano = 2022;
        System.out.println(anoSuperacion(ano, pobA, pobB));
    }

    /**
     * Determinar en que la poblacion del pais B supera la poblacion del pais A.
     *
     * @param ano Ano de inicio
     * @param pobA numero de habitantes en poblacion A en el ano dado
     * @param pobB numero de habitantes en poblacion B en el ano dado
     *
     * @return el ano cuando el pais B supera al pais A
     */
    public static int anoSuperacion(int ano, double pobA, double pobB){

        while (pobB <= pobA){
            pobA += pobA*0.02;
            pobB += pobB*0.03;
            ano++;
        }

        return ano;
    }
}