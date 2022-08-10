import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottle {
    public String verse(int number) {
        String result;
        switch (number) {
            case 0:
                result = quantity(number).toUpperCase() + " " + container(number) + " of beer on the wall," +
                        quantity(number) + " " + container(number) + " of beer.\n" +
                        action(number) +
                        quantity(successor(number)) + " " + container(number - 1) + " of beer on the wall.\n";
                break;
            default:
                result = quantity(number).toUpperCase() + " " + container(number) + " of beer on the wall," +
                        quantity(number) + " " + container(number) + " of beer.\n" +
                        action(number) +
                        quantity(successor(number)) + " " + container(number - 1) + " of beer on the wall.\n";

        }
        return result;
    }

    private int successor(int number) {
        if (number == 0) {
            return 99;
        }
        return number - 1;
    }

    private String action(int number) {
        if (number == 0) {
            return "Go to the store and buy some more, ";
        }
        return "Take " + pronoun(number) + " down and pass it around, ";
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
