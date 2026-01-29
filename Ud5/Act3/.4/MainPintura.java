void main() {
    Pintura pintura = new Pintura(250);
    Forma rectangulo = new Rectangulo(20, 35);
    Forma esfera = new Esfera(15);
    Forma cilindro = new Cilindro(10,30);

    System.out.println(pintura.pinturaNecesaria(rectangulo));
    System.out.println(pintura.pinturaNecesaria(esfera));
    System.out.println(pintura.pinturaNecesaria(cilindro));
}
