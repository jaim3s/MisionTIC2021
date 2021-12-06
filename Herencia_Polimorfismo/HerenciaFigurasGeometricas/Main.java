class Main{
    public static void main(String[] args){
        Circulo titan = new Circulo("rojo", 10);
        System.out.println(titan.toString());
    
        Circulo maya = new Circulo("azul", 5);
        System.out.println(maya.toString());

        Cuadrado sami = new Cuadrado("azul", 5);
        System.out.println(sami.toString());
    
        Cuadrado garfio = new Cuadrado("verde", 10);
        System.out.println(garfio.toString());  

        Triangulo bugs = new Triangulo("purpura", 10, 10);
        System.out.println(bugs.toString());      
    }
}