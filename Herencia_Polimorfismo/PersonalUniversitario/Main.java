class Main{
    public static void main(String[] args){
        Alumno testAlumno = new Alumno("John", "James Clark", 19, "Ingenieria de sistemas", 728.5, 44.4, 4);
        System.out.println(testAlumno.toString());

        Profesor testProfesor = new Profesor("Pepe", "Guardiola", 50, "Deporte en clase", "Fubol\nBasetball", 45.0);
        System.out.println(testProfesor.toString());

        Directivo testDirectivo = new Directivo("Mey", "Takeshi", 42, "Admnistrador de cuentas", "Sector financiero");
        System.out.println(testDirectivo.toString());

        Empleado testEmpleado = new Empleado("Jorge", "Shaumz", 65, "Guardia de seguridad", 1_600_000);
        System.out.println(testEmpleado.toString());       
    }
}