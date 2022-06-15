import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe principal
 *
 * @author Paulo Collares
 */
public class Main {

    public static void main(String[] args) {
        try {
            HttpServer servidor = HttpServer.create(new InetSocketAddress(2005), 0);
            servidor.createContext("/", new Root());
            servidor.createContext("/stats", new Stats());
            servidor.start();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}