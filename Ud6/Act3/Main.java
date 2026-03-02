private static Map<Integer, Ubicacion> ubicaciones = new HashMap<>();
void main() {
    Ubicacion ubicacion = new Ubicacion(0, "Estás sentado en la clase de programación");
    Ubicacion ubicacion1 = new Ubicacion(1, "Estás en la cima de una montaña");
    Ubicacion ubicacion2 = new Ubicacion(2, "Estás bañándote en la playa");
    Ubicacion ubicacion3 = new Ubicacion(3, "Estás dentro de un edificio muy alto");
    Ubicacion ubicacion4 = new Ubicacion(4, "Estes de pie en un puente");
    Ubicacion ubicacion5 = new Ubicacion(5, "Estás en un bosque");

    ubicaciones.put(0, ubicacion);
    ubicaciones.put(1, ubicacion1);
    ubicaciones.put(2, ubicacion2);
    ubicaciones.put(3, ubicacion3);
    ubicaciones.put(4, ubicacion4);
    ubicaciones.put(5, ubicacion5);

    ubicacion1.addExit("N", 5);
    ubicacion1.addExit("S", 4);
    ubicacion1.addExit("E", 3);
    ubicacion1.addExit("O", 2);
    ubicacion1.addExit("Q", 0);

    ubicacion2.addExit("N", 5);
    ubicacion2.addExit("Q", 0);

    ubicacion3.addExit("O", 1);
    ubicacion3.addExit("Q", 0);

    ubicacion4.addExit("N", 1);
    ubicacion4.addExit("O", 2);
    ubicacion4.addExit("Q", 0);

    ubicacion5.addExit("S", 1);
    ubicacion5.addExit("O", 2);
    ubicacion5.addExit("Q", 0);

    ArrayList<Ubicacion> ubisYExits = new ArrayList<>();
    ubisYExits.add(ubicacion);
    ubisYExits.add(ubicacion1);
    ubisYExits.add(ubicacion2);
    ubisYExits.add(ubicacion3);
    ubisYExits.add(ubicacion4);
    ubisYExits.add(ubicacion5);

    Scanner sc = new Scanner(System.in);

    String posicion;
    int posicionInt = 1;

    do {
        System.out.println(ubisYExits.get(posicionInt).getDescripcion());
        System.out.println("Salidas posibles: \n"
                + ubisYExits.get(posicionInt).getExits());
        System.out.println("Introduce la dirección (letra) a la que quieras ir: \n");
        posicion = sc.nextLine().toUpperCase();
        try {
            posicionInt = ubisYExits.get(posicionInt).getExits().get(posicion);
        } catch (Exception e) {
            System.out.println("Ubicación inaccesible o inexistente");
        }
    } while (!(posicion.equalsIgnoreCase("Q")));

    System.out.println(ubisYExits.get(posicionInt).getDescripcion());
}
