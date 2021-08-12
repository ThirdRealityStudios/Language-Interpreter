import net.NetFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Bot<String> bot = new Bot<String>();

        String sample = "Test Hallo Drei Zwei.Eins Null";

        bot.run(bot.toArrayList(sample.split(" ")));
    }
}
