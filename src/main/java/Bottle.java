import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
                result = number + " bottle of beer on the wall," +
                        number + " bottle of beer.\n" +
                        "Take " + pronoun(number) + " down and pass it around, " +
                        "no more bottles of beer on the wall.\n";
                break;
            default:
                result = number + " bottles of beer on the wall," +
                        number + " bottles of beer.\n" +
                        "Take " + pronoun(number) + " down and pass it around, " +
                        (number - 1) + " " + container(number - 1) + " of beer on the wall.\n";

        }
        return result;
    }

    private String pronoun(int number) {
        if (number == 1) {
            return "it";
        }
        return "one";
    }

    private String container(int number) {
        if (number == 1) {
            return "bottle";
        }
        return "bottles";
    }

    public String verses(int starting, int ending) {
        return IntStream.rangeClosed(ending, starting).boxed().sorted(Collections.reverseOrder()).
                map(this::verse).collect(Collectors.joining("\n"));
    }
}
