public class Pintura {
    double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double pinturaNecesaria(Forma forma) {
        return forma.area()/cobertura;
    }
}
