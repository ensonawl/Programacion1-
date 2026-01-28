public class Main {
    public static void main(String[] args) {
        Impresora impresora1 = new Impresora(80, 100, true);
        Impresora impresora2 = new Impresora(60, 200, false);

        System.out.println(impresora2.anadirToner(20));
        System.out.println(impresora1.imprimirPaginas(100));
        System.out.println(impresora2.imprimirPaginas(100));
        System.out.println(impresora1.getPaginasImpresas());
    }
}
