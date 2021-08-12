import net.NetFactory;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException {
        Bot<String> bot = new Bot<String>();

        //String sample = "Test Hallo Drei Zwei.Eins Null";

        String action = "query";
        String format = "json";
        String titles = "Computer";
        String prop = "description";

        URL url = new URL("https://de.wikipedia.org/w/api.php?action=" + action + "&format=" + format + "&titles=" + titles + "&prop=" + prop);

        URLConnection connection = url.openConnection();

        connection.connect();

        System.out.println(new String(connection.getInputStream().readAllBytes()));

        //bot.run(bot.toArrayList(sample.split(" ")));
    }
}
