/**
 * Contiene las 4 operaciones basicas. 
 * 
 */
class Calculadora implements Constante, Operacion{

    /**
     * Suma dos numeros reales.
     *
     * @param a primer numero real
     * @param b segundo numero real
     *
     * @return sumar los dos numeros reales
     */
    public double suma(double a, double b){
        return a + b;
    }

    /**
     * Resta dos numeros reales.
     *
     * @param a primer numero real
     * @param b segundo numero real
     *
     * @return restar los dos numeros reales
     */
    public double resta(double a, double b){
        return a - b;
    }

    /**
     * Multiplica dos numeros reales.
     *
     * @param a primer numero real
     * @param b segundo numero real
     *
     * @return multiplicar los dos numeros reales
     */
    public double multiplicacion(double a, double b){
        return a * b;
    } 

    /**
     * Divide dos numeros reales.
     *
     * @param a primer numero real
     * @param b segundo numero real
     *
     * @return dividir los dos numeros reales
     */ 
    public double division(double a, double b){
        return a / b;
    }      
}