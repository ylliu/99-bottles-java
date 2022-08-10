import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottle {
    public String verse(int number) {
        return new BottleNumber(number).quantity().toUpperCase() + " " + container(number) + " of beer on the wall," +
                new BottleNumber(number).quantity() + " " + container(number) + " of beer.\n" +
                action(number) +
                new BottleNumber(successor(number)).quantity() + " " + container(number - 1) + " of beer on the wall.\n";
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
        return new BottleNumber(number).quantity();
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

class BottleNumber {
    private int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public int successor(int number) {
        if (number == 0) {
            return 99;
        }
        return number - 1;
    }

    public String action(int number) {
        if (number == 0) {
            return "Go to the store and buy some more, ";
        }
        return "Take " + pronoun(number) + " down and pass it around, ";
    }

    public String quantity() {
        if (this.number == 0) {
            return "no more";
        }
        return String.valueOf(this.number);
    }

    public String pronoun(int number) {
        if (number == 1) {
            return "it";
        }
        return "one";
    }

    public String container(int number) {
        if (number == 1) {
            return "bottle";
        }
        return "bottles";
    }
}
