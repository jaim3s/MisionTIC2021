/**
 * Hallar el epsilon mas pequeno de la maquina.
 */
class EpsilonMaquina{
    public static void main(String[] args){
        System.out.println(hallarEpsilon());
    }

    /**
     * Hallar el epsilon mas pequeno de la maquina.
     *
     * @return epsilon mas pequeno
     */
    public static double hallarEpsilon(){
        double power = 0;
        double epsilon = Math.pow(2, power);
        while (epsilon + 1 != 1){
            power--;
            epsilon = Math.pow(2, power);
        }
        return epsilon;
    }
}