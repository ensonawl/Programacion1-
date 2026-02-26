public class Planeta extends CuerpoCeleste {
    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste cuerpoCeleste) {
        if (getTipoCuerpo().equals(TipoCuerpoCeleste.LUNA)) {
            return getSatelites().add(cuerpoCeleste);
        } else {
            return false;
        }
    }
}
