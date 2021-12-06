/**
 * Representa la figura geometrica triangulo.
 * 
 * @param base lado del triangulo
 * @param altura lado del triangulo
 *
 */
class Triangulo extends Figura{


    // Atributos
    double base;
    double altura;

    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Hallar el perimetro de la figura.
     *
     * @return perimetro.
     */
    @Override
    public double perimetro(){
        return this.base*3;
    }

    /**
     * Hallar el area de la figura.
     *
     * @return area.
     */
    @Override
    public double area(){
        return (base*altura)/2;
    }

    /**
     * Representar el objeto como un string.
     *
     * @return representacion del objeto en formato string.
     */
    @Override
    public String toString(){
    return "Color: " + this.color + "\nBase: " + this.base + "\nAltura: " + this.altura + "\nPerimetro: " + this.perimetro() + "\nArea: " + this.area();
    }

}