/**
 * Clase para identifar un profesor universitario.
 *
 * @param nombre el nombre de la persona como un string
 * @param apellidos el apellido de la persona como un string
 * @param edad la edad de la persona como un entero mayor a 0
 * @param maestria titulo de maestria
 * @param materias materias que dicta dentro de la universidad
 * @param promedio promedio final calificatido por los estudiantes
 *
 */
class Profesor extends Persona{

    // Atributos de clase
    String maestria;
    String materias;
    double promedio;

    public Profesor(String nombre, String apellidos, int edad, String maestria, String materias, double promedio){
        super(nombre, apellidos, edad);

        this.maestria = maestria;
        this.materias = materias;
        this.promedio = promedio;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return string representando los atributos del objeto
     */
    public String toString(){
        return "Nombre: " + this.getNombre() + "\nApellidos: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nMaestria: " + this.maestria + "\nMaterias: " + this.materias + "\nPromedio final: " + this.promedio;
    }
}