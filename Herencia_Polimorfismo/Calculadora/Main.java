class Main{
    public static void main(String[] args){
        Calculadora test = new Calculadora(); 
        System.out.println(test.suma(test.PI, 3));
        System.out.println(test.multiplicacion(test.E, 3));
        System.out.println(test.division(100, 5));
        System.out.println(test.resta(100, 5));
    }
}