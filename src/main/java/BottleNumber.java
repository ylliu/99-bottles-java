class BottleNumber {
    private int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public static BottleNumber bottleNumberFor(int number) {
        return switch (number) {
            case 0 -> new BottleNumber0(number);
            case 1 -> new BottleNumber1(number);
            case 6 -> new BottleNumber6(number);
            default -> new BottleNumber(number);
        };
    }

    public BottleNumber successor() {
        return bottleNumberFor(this.number - 1);
    }

    public String action() {
        return "Take " + pronoun() + " down and pass it around, ";
    }

    public String quantity() {
        return String.valueOf(this.number);
    }

    public String pronoun() {
        return "one";
    }

    public String container() {
        return "bottles";
    }

    public String toString() {
        return quantity() + " " + container();
    }
}

class BottleNumber0 extends BottleNumber {

    public BottleNumber0(int number) {
        super(number);
    }

    public String action() {
        return "Go to the store and buy some more, ";
    }

    public String quantity() {
        return "no more";
    }

    public BottleNumber successor() {
        return bottleNumberFor(99);
    }
}

class BottleNumber1 extends BottleNumber {

    public BottleNumber1(int number) {
        super(number);
    }

    public String pronoun() {
        return "it";
    }

    public String container() {
        return "bottle";
    }
}

class BottleNumber6 extends BottleNumber {

    public BottleNumber6(int number) {
        super(number);
    }

    public String quantity() {
        return "1";
    }

    public String container() {
        return "six-pack";
    }

}
