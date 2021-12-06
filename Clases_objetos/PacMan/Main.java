class Main{
    public static void main(String[] args){
        PacMan pepe = new PacMan("Amarillo", 75, 3);
        Tablero tablero = new Tablero(pepe);
        System.out.println(tablero.nivel);
        tablero.comprobarNivelActual();
        System.out.println(tablero.nivel);
    }
}