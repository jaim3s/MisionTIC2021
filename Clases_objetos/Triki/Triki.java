/**
 * Recrear el juego triki (Tictactoe).
 * La letra 'a' representa una casilla vacia y los jugadores son respectivamente:
 * jugador 1 -> 'x' 
 * jugador 2 -> 'o'
 */
class Triki{

    // Atributos
    char[][] matriz = new char[3][3];

    public Triki(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matriz[i][j] = 'a'; 
            }
        }
    }

    /**
     * Marcar una casilla en la matriz.
     *
     * @param simbolo simbolo del jugador
     * @param fila fila de la matriz
     * @param columna columna de la matriz
     *
     * @return void.
     */
    public void marcarCasilla(char simbolo, int fila, int columna){
        this.matriz[fila][columna] = simbolo;
    }

    /**
     * Verificar una casilla en la matriz.
     *
     * @param fila fila de la matriz
     * @param columna columna de la matriz
     *
     * @return elemento en la posicion dada.
     */
    public char verificarCasilla(int fila, int columna){
        return this.matriz[fila][columna];
    }

    /**
     * Verificar ganador del juego.
     *
     * @return retornar caracter del ganador x, o y si no hay ganado retornar a.
     */
    public char verificarGanador(){
        // Contadores de filas
        int filasX = 0;
        int filasO = 0;

        // Contadores de columnas
        int columnasX = 0;
        int columnasO = 0;

        // Contadores de diagonales
        int diagonalPrincipalX = 0; 
        int diagonalSecundariaX = 0;
        int diagonalPrincipalO = 0; 
        int diagonalSecundariaO = 0;

        // Revisar filas y columnas 
        for (int i = 0; i < this.matriz.length; i++){
             for (int j = 0; j < this.matriz.length; j++){
                // Filas
                if (verificarCasilla(i, j) == 'x') filasX++; 
                else if (verificarCasilla(i, j) == 'o') filasO++; 

                // Columnas
                if (verificarCasilla(j, i) == 'x') columnasX++; 
                else if (verificarCasilla(j, i) == 'o') columnasO++; 
            }

            // Revisar si hay algun ganador con filas y columnas
            if (filasX == 3 || columnasX == 3){
                return 'x';
            }
            else if (filasO == 3 || columnasO == 3){
                return 'o';
            }

            // Contar diagonal principal y secundaria
            if (verificarCasilla(i, i) == 'x'){
                diagonalPrincipalX++;
            }else if (verificarCasilla(i, i) == 'o'){
                diagonalPrincipalO++;
            }

            if (verificarCasilla(i, 2-i) == 'x'){
                diagonalSecundariaX++;
            }else if (verificarCasilla(i, 2-i) == 'o'){
                diagonalSecundariaO++;
            }

            //Reiniciar contadores filas y columnas
            filasX = 0;
            columnasX = 0;
            filasO = 0;
            columnasO = 0;
        }

        // Revisar si hay algun ganador con diagonales
        if (diagonalPrincipalX == 3 || diagonalSecundariaX == 3){
            return 'x';
        }else if (diagonalPrincipalO == 3 || diagonalSecundariaO == 3){
            return 'o';
        }

        return 'a';
    }
}