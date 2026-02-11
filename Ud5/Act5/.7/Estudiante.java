public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int altura, edad;

    public Estudiante(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    @Override
    public int compareTo(Estudiante o) {
        int result = 0;
        if (this.altura < o.altura) {
            result = 1;
        } else if (this.altura > o.altura) {
            result = -1;
        } else {
            if (this.edad < o.edad) {
                result = 1;
            } else if (this.edad > o.edad) {
                result = -1;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }
}
