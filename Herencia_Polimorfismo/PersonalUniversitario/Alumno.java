/**
 * Clase para identifar un alumno universitario.
 *
 * @param nombre el nombre de la persona como un string
 * @param apellidos el apellido de la persona como un string
 * @param edad la edad de la persona como un entero mayor a 0
 * @param programaCurricular carrera que esta cursando
 * @param puntajeAdmision puntaje para ingresar a la universidad
 * @param promedio promedio total de notas
 * @param matriculas cuantas matriculas ha inscrito en la universidad
 *
 */
class Alumno extends Persona{

    // Atributos de clase
    String programaCurricular;
    double puntajeAdmision;
    double promedio;
    int matriculas;

    public Alumno(String nombre, String apellidos, int edad, String programaCurricular, double puntajeAdmision, double promedio, int matriculas){
        super(nombre, apellidos, edad);

        this.programaCurricular = programaCurricular;
        this.puntajeAdmision = puntajeAdmision;
        this.promedio = promedio;
        this.matriculas = matriculas;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return string representando los atributos del objeto
     */
    public String toString(){
        return "Nombre: " + this.getNombre() + "\nApellidos: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nPrograma curricular: " + this.programaCurricular + "\nPuntaje Admision: " + this.puntajeAdmision + "\nPromedio final: " + this.promedio + "\nMatriculas: " + this.matriculas;
    }
}