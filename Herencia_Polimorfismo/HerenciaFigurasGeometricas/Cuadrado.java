/**
 * Representa la figura geometrica cuadrado.
 * 
 * @param lado lado del cuadrado
 *
 */
class Cuadrado extends Figura{


    // Atributos
    double lado;

    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    /**
     * Hallar el perimetro de la figura.
     *
     * @return perimetro.
     */
    @Override
    public double perimetro(){
        return this.lado*4;
    }

    /**
     * Hallar el area de la figura.
     *
     * @return area.
     */
    @Override
    public double area(){
        return lado*lado;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return representacion del objeto en formato string.
     */
    @Override
    public String toString(){
        return "Color: " + this.color + "\nLado: " + this.lado + "\nPerimetro: " + this.perimetro() + "\nArea: " + this.area();
    }

}