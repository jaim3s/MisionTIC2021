/**
 * Representar figuras geometricas.
 * 
 * @param color representa el color de la figura
 */
class Figura{

    // Atributos
    String color;

    public Figura(String color){
        this.color = color;
    }

    /**
     * Hallar el perimetro de la figura.
     *
     * @return perimetro.
     */
    public double perimetro(){
        return 0;
    }

    /**
     * Hallar el area de la figura.
     *
     * @return area.
     */
    public double area(){
        return 0;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return representacion del objeto en formato string.
     */
    public String toString(){
        return "Color: " + this.color + "\nPerimetro: " + this.perimetro() + "\nArea: " + this.area();
    }      
}