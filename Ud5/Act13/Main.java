public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.0);
        Cilindro cilindro = new Cilindro(9.0, 2.0);
        System.out.println(circulo.getRadio());
        System.out.println(cilindro.getArea());
        System.out.println(cilindro.getAltura());
        System.out.println(cilindro.getVolume());
    }
}