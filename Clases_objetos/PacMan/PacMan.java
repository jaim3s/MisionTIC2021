/**
 * Crear personaje de la simulacion al videojuego PacMan.
 *
 * @param color especifica el color del personaje.
 * @param puntuacion especifica la puntuacion actual del personaje.
 * @param vidasRestantes especifica las vidas restantes del personaje.
 *
 */
class PacMan{

    // Atributos
    String color = "Amarillo";
    int puntuacion = 0;
    int vidasRestantes = 3;

    public PacMan(String color, int puntuacion, int vidasRestantes){
        this.color = color;
        this.puntuacion = puntuacion;
        this.vidasRestantes = vidasRestantes;
    }

    /**
     * Sumar 1 a atributo puntuacion.
     *
     * @return void.
     */
    public void sumarPuntuacion(){
        this.puntuacion++;
    }   

    /**
     * Obtener puntuacion actual del objeto.
     *
     * @return atributo puntuacion.
     */
    public int obtenerPuntuacion(){
        return this.puntuacion;
    }

    /**
     * Restar 1 al atributo de vidasRestantes.
     *
     * @return void.
     */
    public void restarVida(){
        this.vidasRestantes--;
    }    

    /**
     * Determinar si el personaje sigue con vida.
     *
     * @return retornar true si vidas restantes es mayor a 0 de otra manera false.
     */
    public boolean sigueVivo(){
        return this.vidasRestantes > 0;
    }
}