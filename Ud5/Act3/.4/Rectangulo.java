public class Rectangulo extends Forma {
    int longitud, ancho;

    public Rectangulo(int longitud, int ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
        nombre = "Rectangulo";
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
