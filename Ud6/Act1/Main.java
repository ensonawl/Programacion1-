void main() {
    Contacto yo = new Contacto("Yo", "123456789");

    ArrayList<Contacto> misContactos = new ArrayList<>();
    TelefonoMovil telefonoMovil = new TelefonoMovil("123456789", misContactos);

    String menu = "Menú:\n 0. Salir\n 1. Imprimir Contactos\n " +
            "2. Agregar nuevo contacto\n 3. Actualizar contacto\n " +
            "4. Eliminar contacto\n 5. Buscar contacto\n " +
            "6. Imprimir menú de opciones";

    System.out.println(menu);

    Scanner sc = new Scanner(System.in);
    int opt;
    String nombre;
    String numTel;
    Contacto vContact;
    do {
        opt = sc.nextInt();
        sc.nextLine();
        if (opt == 1) {
            System.out.println("Imprimiendo contactos...");
            telefonoMovil.printContacts();
        } else if (opt == 2) {
            System.out.println("Agregar contacto: ");
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Número de teléfono: ");
            numTel = sc.nextLine();
            vContact = new Contacto(nombre, numTel);
            if (telefonoMovil.addNewContact(vContact)) {
                System.out.println("Contacto agregado");
            } else {
                System.out.println("Error al agregar contacto");
            }
        } else if (opt == 3) {
            System.out.println("Actualizar contacto: ");
            System.out.println("Nombre del contacto a actualizar: ");
            nombre = sc.nextLine();
            String nombreAntiguo = nombre;
            if (telefonoMovil.findContact(telefonoMovil.queryContact(nombre)) != -1) {
                System.out.println("Nombre: ");
                nombre = sc.nextLine();
                System.out.println("Número de teléfono: ");
                numTel = sc.nextLine();
                vContact = new Contacto(nombre, numTel);
                telefonoMovil.updateContact(telefonoMovil.queryContact(nombreAntiguo), vContact);
            } else {
                System.out.println("Error al actualizar contacto");
            }
        } else if (opt == 4) {
            System.out.println("Eliminar contacto: ");
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            if (telefonoMovil.findContact(telefonoMovil.queryContact(nombre)) != -1) {
                telefonoMovil.removeContact(telefonoMovil.queryContact(nombre));
            } else {
                System.out.println("Error al eliminar contacto");
            }
        } else if (opt == 5) {
            System.out.println("Buscar contacto: ");
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            if (telefonoMovil.findContact(nombre) != -1) {
                System.out.println("Nombre: " + telefonoMovil.queryContact(nombre).name);
                System.out.println("Número de teléfono: " + telefonoMovil.queryContact(nombre).phoneNumber);
            } else {
                System.out.println("Contacto no encontrado");
            }
        } else if (opt == 6) {
            System.out.println("Imprimiendo menú: ");
            System.out.println(menu);
        } else if (opt == 0) {
            System.out.println("Saliendo del programa: ");
        }
    } while (opt != 0);
}
