class Main{
    public static void main(String[] args){
        Triki test = new Triki();
        test.marcarCasilla('x', 0, 0);
        test.marcarCasilla('o', 0, 2);
        test.marcarCasilla('x', 1, 0);
        test.marcarCasilla('o', 1, 2);
        test.marcarCasilla('x', 2, 0);
        System.out.println(test.verificarGanador());
    }
}