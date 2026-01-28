public class Impresora {
    private int nivelToner, paginasImpresas;
    private boolean dobleCara;

    public Impresora(int nivelToner, int paginasImpresas, boolean dobleCara) {
        this.nivelToner = nivelToner;
        this.paginasImpresas = paginasImpresas;
        this.dobleCara = dobleCara;
    }

    public int anadirToner(int cantidadAnadida) {
        this.nivelToner += cantidadAnadida;

        if (this.nivelToner>100) {
            this.nivelToner = -1;
        } else if (this.nivelToner<0) {
            this.nivelToner = -1;
        }

        return this.nivelToner;
    }

    public int imprimirPaginas(int cantidadPags) {
        if (this.dobleCara) {
            cantidadPags /= 2;
            cantidadPags += cantidadPags % 2;
        }

        this.paginasImpresas += cantidadPags;

        return cantidadPags;
    }

    public int getPaginasImpresas() {
        return paginasImpresas;
    }
}
