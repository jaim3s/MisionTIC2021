import java.util.Random;

/**
 * Crear contrasena con una longitud dada.
 *
 * @param longitud numero de caracteres que posee la contrasena
 * @param contrasena caracteres en la contrasena
 *
 */
class Contrasena{

    // Atributos

    int longitud = 8;
    String contrasena;

    public Contrasena(int longitud, String contrasena){
        this.longitud = longitud;
        this.contrasena = contrasena;
    }

    /**
     * Determinar si una contrasena es fuerte.
     * Una contrasena es fuerte cuando tiene una mayuscula, minuscula y 5 numeros.
     *
     * @return true si es fuerte de otra manera false. 
     */
    public boolean esFuerte(){
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean num = false;
        int numeros = 0; 
        for (int i = 0; i < this.longitud; i++){
   
            if (Character.isUpperCase(this.contrasena.charAt(i))) mayuscula = true;
            if (Character.isLowerCase(this.contrasena.charAt(i))) minuscula = true;
            if (Character.isDigit(this.contrasena.charAt(i))) numeros++;

        }

        if (numeros > 5) num = true;

        return mayuscula == true && minuscula == true && num == true;
    }

    /**
     * Cambiar la contrasena por una nueva contrasena.
     *
     * @param nuevaContrasena
     *
     * @return void.
     */
    public void cambiarContrasena(String nuevaContrasena){
        this.contrasena = nuevaContrasena;
        this.longitud = nuevaContrasena.length();
    }

    /**
     * Representar la informacion del objeto como un string.
     *
     * @return void.
     */
    public String toString(){
        return "contrasena: " + this.contrasena + "\nlongitud: " + this.longitud + "\nEs fuerte: " + this.esFuerte(); 
    }
}