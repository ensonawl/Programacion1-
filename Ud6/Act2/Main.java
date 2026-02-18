void main() {
    Scanner sc = new Scanner(System.in);

    LinkedList<Cancion> playlist = new LinkedList<>();

    Album channelOrange = new Album("channel Orange", "Frank Ocean");
    channelOrange.addSong("Forest Gump", 3);
    channelOrange.addSong("Vodoo", 1);
    channelOrange.addSong("Pyramids", 8.50);

    Album theLifeOfPablo = new Album("The Life Of Pablo", "Kanye West");
    theLifeOfPablo.addSong("Fade", 3.50);
    theLifeOfPablo.addSong("No More Parties In LA", 7.50);
    theLifeOfPablo.addSong("30 Hours", 5);

    channelOrange.addToPlayList(2, playlist);
    theLifeOfPablo.addToPlayList(1, playlist);

    int opt;
    int trackActual = 0;
    do {
        String menu = "***** MENU *****\n0 - Salir" +
                "\n1 - Siguiente Cancion\n2 - Cancion Anterior" +
                "\n3 - Repetir Cancion\n4 - Canciones de la Playlist" +
                "\n5 - Reimprimir Menú";
        System.out.println(menu + "\n");
        System.out.println("Introduce una opción (0 - 6): ");
        try {
            opt = sc.nextInt();
        } catch (Exception e) {
            opt = -1;
        }
        System.out.println();
        if (opt == 0) {
            System.out.println("Saliendo...");
        } else if (opt == 1) {
            System.out.println("Siguiente Cancion");
            trackActual++;
            if (trackActual >= playlist.size()) {
                trackActual = 0;
            }
            System.out.println("Esta sonando: \n" +
                    playlist.get(trackActual).getTitulo());
        } else if (opt == 2) {
            System.out.println("Cancion Anterior");
            trackActual--;
            if (trackActual < 0) {
                trackActual = playlist.size() - 1;
            }
            System.out.println("Esta sonando: \n" +
                    playlist.get(trackActual).getTitulo());
        } else if (opt == 3) {
            System.out.println("Repetir Cancion");
            System.out.println("Esta sonando: \n" +
                    playlist.get(trackActual).getTitulo());
        } else if (opt == 4) {
            System.out.println("PlayList: ");
            Album.printPlaylist(playlist);
        } else if (opt == 5) {
            System.out.println("Reimprimiendo Menú...");
            System.out.println(menu);
        } else {
            System.out.println("Opción inválida");
        }
        System.out.println();
    } while (opt != 0);
}
