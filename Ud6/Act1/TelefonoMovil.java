import java.util.ArrayList;

public class TelefonoMovil {
    String myNumber;
    ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber, ArrayList<Contacto> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contacto nuevoContacto) {
        boolean bool = false;
        if (!(myContacts.contains(nuevoContacto))) {
            myContacts.addLast(nuevoContacto);
            bool = true;
        }
        return bool;
    }

    public boolean updateContact(Contacto antiguo, Contacto nuevo) {
        boolean bool = false;
        int posicion;
        if (myContacts.contains(antiguo)) {
            posicion = myContacts.indexOf(antiguo);
            myContacts.set(posicion, nuevo);
            bool = true;
        }
        return bool;
    }

    public boolean removeContact(Contacto borrar) {
        return myContacts.remove(borrar);
    }

    public int findContact(Contacto buscar) {
        int posicion = -1;
        if (myContacts.contains(buscar)) {
            posicion = myContacts.indexOf(buscar);
        }
        return posicion;
    }

    public int findContact(String buscarNombre) {
        int posicion = 0;
        for (Contacto contact : myContacts) {
            if (contact.name.equals(buscarNombre)) {
                return posicion;
            }
            posicion++;
        }
        return -1;
    }

    public Contacto queryContact(String nombre) {
        int posicion = 0;
        Contacto contacto;
        for (Contacto contact : myContacts) {
            if (contact.name.equals(nombre)) {
                break;
            }
            posicion++;
        }
        contacto = myContacts.get(posicion);

        return contacto;
    }

    public void printContacts() {
        System.out.println("Lista de contactos: ");
        for (Contacto contact : myContacts) {
            System.out.println(contact.name + ": " + contact.phoneNumber);
        }
    }
}
