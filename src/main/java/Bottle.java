import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottle {
    public String verse(int number) {
        return new BottleNumber(number).quantity().toUpperCase() + " " + new BottleNumber(number).container() + " of beer on the wall," +
                new BottleNumber(number).quantity() + " " + new BottleNumber(number).container() + " of beer.\n" +
                action(number) +
                new BottleNumber(new BottleNumber(number).successor(number)).quantity() + " " + new BottleNumber(number - 1).container() + " of beer on the wall.\n";
    }

    private String action(int number) {
        return new BottleNumber(number).action();
    }

    public String verses(int starting, int ending) {
        return IntStream.rangeClosed(ending, starting).boxed().sorted(Collections.reverseOrder()).
                map(this::verse).collect(Collectors.joining("\n"));
    }
}

