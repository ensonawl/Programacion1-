import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    String nombre, artista;
    ArrayList<Cancion> canciones;

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    private Cancion findSong(String titulo) {
        /*
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.equals(titulo)) {
                return canciones.get(i);
                // return canciones.get(canciones.indexOf(titulo));
            } else {
                return null;
            }
        }
        */
        /*
        int i = 0;
        for (Cancion cancion : canciones) {
            if (cancion.equals(titulo)) {
                return canciones.get(i);
            }
            i++;
        }
        return null;
        */
        if (canciones.isEmpty()) {
            return null;
        } else {
            for (Cancion cancion : canciones) {
                if (cancion.getTitulo().equals(titulo)) {
                    return cancion;
                }
            }
        }
        return null;
    }

    public boolean addSong(String titulo, double duracion) {
        if (findSong(titulo) == null) {
            try {
                Cancion cancionAdd = new Cancion(titulo, duracion);
                canciones.add(cancionAdd);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int numPista, LinkedList<Cancion> playlist) {
        Cancion trackPlaylist;
        try {
            trackPlaylist = canciones.get(numPista);
        } catch (Exception e) {
            return false;
        }
        if (trackPlaylist != null) {
            playlist.add(trackPlaylist);
        } else {
            return false;
        }
        return true;
    }

    public static void printPlaylist(LinkedList<Cancion> playlist) {
        for (Cancion cancion : playlist) {
            System.out.println("- " + cancion.getTitulo());
        }
    }
}
