/**
 * Representa la figura geometrica circulo.
 * 
 * @param radio radio del circulo
 *
 */
class Circulo extends Figura{


    // Atributos
    double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    /**
     * Hallar el perimetro de la figura.
     *
     * @return perimetro.
     */
    @Override
    public double perimetro(){
        return Math.PI*radio*2;
    }

    /**
     * Hallar el area de la figura.
     *
     * @return area.
     */
    @Override
    public double area(){
        return Math.PI*(radio*radio);
    }

    /**
     * Representar el objeto como un string.
     *
     * @return representacion del objeto en formato string.
     */
    @Override
    public String toString(){
        return "Color: " + this.color + "\nRadio: " + this.radio + "\nPerimetro: " + this.perimetro() + "\nArea: " + this.area();
    }

}