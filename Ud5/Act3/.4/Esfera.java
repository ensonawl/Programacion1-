public class Esfera extends Forma {
    int radio;

    public Esfera(int radio) {
        this.radio = radio;
        nombre = "Esfera";
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
