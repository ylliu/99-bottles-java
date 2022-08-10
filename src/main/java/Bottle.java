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
            default:
                result = number + " " + container(number) + " of beer on the wall," +
                        number + " " + container(number) + " of beer.\n" +
                        "Take " + pronoun(number) + " down and pass it around, " +
                        quantity(number - 1) + " " + container(number - 1) + " of beer on the wall.\n";

        }
        return result;
    }

    private String quantity(int number) {
        if (number == 0) {
            return "no more";
        }
        return String.valueOf(number);
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
