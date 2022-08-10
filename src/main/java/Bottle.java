import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottle {
    public String verse(int number) {
        BottleNumber bottleNumber = BottleNumber.bottleNumberFor(number);
        return capitalize(bottleNumber + " of beer on the wall,") +
                bottleNumber + " of beer.\n" +
                bottleNumber.action() +
                bottleNumber.successor() + " of beer on the wall.\n";
    }

    public String verses(int starting, int ending) {
        return IntStream.rangeClosed(ending, starting).boxed().sorted(Collections.reverseOrder()).
                map(this::verse).collect(Collectors.joining("\n"));
    }

    public static String capitalize(String str) {
        if (str == null || str.length() <= 1) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }


}

