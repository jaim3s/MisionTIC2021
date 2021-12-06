/**
 * Clase para identifar un directivo universitario.
 *
 * @param nombre el nombre de la persona como un string
 * @param apellidos el apellido de la persona como un string
 * @param edad la edad de la persona como un entero mayor a 0
 * @param cargo cargo que sostiene dentro de la institucion
 * @param dependencia encargado de algun sector dentro de la institucion
 *
 */
class Directivo extends Persona{

    // Atributos de clase
    String cargo;
    String dependencia;

    public Directivo(String nombre, String apellidos, int edad, String cargo, String dependencia){
        super(nombre, apellidos, edad);

        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return string representando los atributos del objeto
     */
    public String toString(){
        return "Nombre: " + this.getNombre() + "\nApellidos: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nCargo: " + this.cargo + "\nDependencia: " + this.dependencia;
    }
}