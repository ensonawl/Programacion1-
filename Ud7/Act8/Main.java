import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String titulo = args[0];
        String palabra = args[1];

        FileReader fr;
        try {
            fr = new FileReader(titulo);
            BufferedReader br = new BufferedReader(fr);
            int num = 0;
            String read;
            while ((read = br.readLine()) != null) {
                if (read.contains(palabra)) {
                    num++;
                }
            }
            System.out.println("Contiene la palabra " + palabra + " " + num + " vez/veces.");
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
