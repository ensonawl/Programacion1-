import java.util.HashSet;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste
    {ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE}

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        satelites = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<CuerpoCeleste> getSatelites() {
        HashSet<CuerpoCeleste> copiaSatelites = new HashSet<>(satelites);
        return copiaSatelites;
    }

    public boolean addSatelite(CuerpoCeleste cuerpoCeleste) {
        return satelites.add(cuerpoCeleste);
    }

    public boolean equals(CuerpoCeleste cuerpoCeleste) {
        return (cuerpoCeleste.getNombre().equals(nombre)) &&
                (cuerpoCeleste.getTipoCuerpo().equals(tipoCuerpo));
    }

    @Override
    public int hashCode() {
        return nombre.hashCode()
                + tipoCuerpo.hashCode() + (int) (Math.random() * 10);
    }

    @Override
    public String toString() {
        return nombre + ": " + tipoCuerpo + ", " + periodoOrbital;
    }
}
