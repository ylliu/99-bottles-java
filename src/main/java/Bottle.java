import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bottle {
    public String verse(int number) {
        String result;
        switch (number) {
            case 0:
                result = "No more bottles of beer on the wall," +
                        "no more bottles of beer.\n" +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n";
                break;
            case 1:
                result = "1 bottle of beer on the wall," +
                        "1 bottle of beer.\n" +
                        "Take it down and pass it around, " +
                        "no more bottles of beer on the wall.\n";
                break;
            case 2:
                result = "2 bottles of beer on the wall," +
                        "2 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "1 bottle of beer on the wall.\n";
                break;
            default:
                result = number + " bottles of beer on the wall," +
                        number + " bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        (number - 1) + " bottles of beer on the wall.\n";

        }
        return result;
    }

    public String verses(int starting, int ending) {
        return IntStream.rangeClosed(ending, starting).boxed().sorted(Collections.reverseOrder()).
                map(this::verse).collect(Collectors.joining("\n"));
    }
}
