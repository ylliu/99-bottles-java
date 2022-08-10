import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottle {
    public String verse(int number) {
        BottleNumber bottleNumber = new BottleNumber(number);
        BottleNumber nextBottleNumber = new BottleNumber(bottleNumber.successor(number));
        return bottleNumber.quantity().toUpperCase() + " " + bottleNumber.container() + " of beer on the wall," +
                bottleNumber.quantity() + " " + bottleNumber.container() + " of beer.\n" +
                bottleNumber.action() +
                nextBottleNumber.quantity() + " " + nextBottleNumber.container() + " of beer on the wall.\n";
    }

    public String verses(int starting, int ending) {
        return IntStream.rangeClosed(ending, starting).boxed().sorted(Collections.reverseOrder()).
                map(this::verse).collect(Collectors.joining("\n"));
    }
}

