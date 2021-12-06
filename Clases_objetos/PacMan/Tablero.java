/**
 * Creacion del tablero para simular el videojuego de PacMan.
 *
 * @param personaje objeto PacMan que simula el personaje 
 * @param nivel determina nivel actual de la simulacion
 *
 */
class Tablero{

    PacMan personaje;
    int nivel; 

    public Tablero(PacMan personaje){
        this.personaje = personaje;
        this.nivel = 0;
    }

    /**
     * Determinar el nivel actual de la simulacion.
     *
     * @return void.
     */
    public void comprobarNivelActual(){
        this.nivel = this.personaje.obtenerPuntuacion()/25;
    }

}