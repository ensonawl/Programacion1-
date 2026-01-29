public class Cilindro extends Forma {
    int radio, altura;

    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
        nombre = "Cilindro";
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
