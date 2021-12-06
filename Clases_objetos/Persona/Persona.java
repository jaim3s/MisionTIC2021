/**
 * Informacion acerca de una persona
 *
 * @param nombre nombre y apellido de la persona
 * @param edad edad de la persona en enteros positivos
 * @param genero genero de la persona 'F' - femenino y 'M' masculino
 * @param peso peso de la persona en double
 * @param altura altura de la persona en double
 *
 */
class Persona{

    // Atributos
    String nombre;
    int edad;
    char genero;
    double peso; 
    double altura; 

    public Persona(String nombre, int edad, char genero, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad ;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcular el IMC (indice de masa corporal).
     *
     * @return retornar double representando el IMC.
     */
    public double calcularIMC(){
        return this.peso/Math.pow(this.altura, 2);
    }

    /**
     * Determinar si una Persona es mayor de edad (edad >= 18).
     *
     * @return retornar true si es mayor de edad de otra manera false.
     */
    public boolean esMayorDeEdad(){
        if (this.edad >= 18){
           return true; 
        }
        return false;    
    }
    
    /**
     * Representar la informacion del objeto como un string.
     *
     * @return void.
     */
    public String toString(){
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nGenero: " + this.genero + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\nIMC: " + this.calcularIMC() + "\nEs mayor de edad: " + this.esMayorDeEdad();
    }  
}