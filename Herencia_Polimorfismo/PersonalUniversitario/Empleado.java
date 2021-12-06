/**
 * Clase para identifar un empleado universitario.
 *
 * @param nombre el nombre de la persona como un string
 * @param apellidos el apellido de la persona como un string
 * @param edad la edad de la persona como un entero mayor a 0
 * @param cargo cargo que sostiene dentro de la institucion
 * @param sueldo sueldo a pagar al empleado
 *
 */
class Empleado extends Persona{

    // Atributos de clase
    String cargo;
    int sueldo;

    public Empleado(String nombre, String apellidos, int edad, String cargo, int sueldo){
        super(nombre, apellidos, edad);

        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return string representando los atributos del objeto
     */
    public String toString(){
        return "Nombre: " + this.getNombre() + "\nApellidos: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nCargo: " + this.cargo + "\nSueldo: " + this.sueldo;
    }
}