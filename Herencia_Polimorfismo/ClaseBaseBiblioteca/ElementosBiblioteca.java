/**
 * Superclase para definir los elementos en comun que tiene una libreria.
 *
 * @param titulo titulo del elemento dentro de la biblioteca
 * @param autores autores que participaron en la redaccion del elemento
 * @param editorial editorial que publico el elemento de la biblioteca
 * @param fechaPublicacion fecha de publicacion del elemento
 * @param ISNB numero de identifiacion del elemento
 *
 */
class ElementosBiblioteca{

    // Atributos
    String titulo;
    String autores;
    String editorial;
    int fechaPublicacion;
    int ISNB;

    public ElementosBiblioteca(String titulo, String autores, String editorial, int fechaPublicacion, int ISNB){
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.ISNB = ISNB;
    }

}