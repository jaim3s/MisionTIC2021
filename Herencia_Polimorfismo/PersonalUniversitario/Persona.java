/**
 * Clase para identifar una persona.
 *
 * @param nombre el nombre de la persona como un string
 * @param apellidos el apellido de la persona como un string
 * @param edad la edad de la persona como un entero mayor a 0
 *
 */
public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Metodos para obtener informacion acerca de la persona.
     *
     * @return el parametro solicitado
     */
    public String getNombre(){ return nombre; }
    public String getApellidos(){ return apellidos; }
    public int getEdad(){ return edad; }
} 