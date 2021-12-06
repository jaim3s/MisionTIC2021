/**
 * Clase para representar un libro dentro de una biblioteca
 *
 * @param titulo titulo del elemento dentro de la biblioteca
 * @param autores autores que participaron en la redaccion del elemento
 * @param editorial editorial que publico el elemento de la biblioteca
 * @param fechaPublicacion fecha de publicacion del elemento
 * @param ISNB numero de identifiacion del elemento
 *
 */
class Libro extends ElementosBiblioteca{

    public Libro(String titulo, String autores, String editorial, int fechaPublicacion, int ISNB){
        super(titulo, autores, editorial, fechaPublicacion, ISNB); 
    }
}