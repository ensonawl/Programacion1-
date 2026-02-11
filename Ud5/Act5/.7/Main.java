void main() {
    Estudiante e1 = new Estudiante("Pablo", 170, 14);
    Estudiante e2 = new Estudiante("Shaq", 182, 16);
    Estudiante e3 = new Estudiante("Andrea", 166, 17);
    Estudiante e4 = new Estudiante("Carlos", 170, 15);
    Estudiante e5 = new Estudiante("Silvia", 152, 18);
    Estudiante e6 = new Estudiante("Alba", 170, 18);
    Estudiante e7 = new Estudiante("Cris", 172, 18);
    Estudiante e8 = new Estudiante("Marcos", 175, 17);
    Estudiante e9 = new Estudiante("Diego", 180, 16);
    Estudiante e10 = new Estudiante("Carmen", 168, 19);

    Estudiante[] estudiantes = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};

    System.out.println("***** ESTUDIANTES *****");

    Arrays.sort(estudiantes);

    for (Estudiante value : estudiantes) {
        System.out.println(value.toString());
    }

    System.out.println("***** ESTUDIANTES 2 *****");

    Estudiante e11 = new Estudiante("Patri", 170, 12);
    Estudiante e12 = new Estudiante("Manuel", 173, 43);
    Estudiante e13 = new Estudiante("Javier", 189, 72);
    Estudiante e14 = new Estudiante("Alicia", 168, 52);
    Estudiante e15 = new Estudiante("Alberto", 189, 35);

    Estudiante[] estudiantes2 = {e11, e12, e13, e14, e15};

    System.out.println("Sin ordenar: ");

    for (Estudiante value : estudiantes2) {
        System.out.println(value.toString());
    }

    System.out.println("Ordenados: ");

    Arrays.sort(estudiantes2);

    for (Estudiante value : estudiantes2) {
        System.out.println(value.toString());
    }
}
