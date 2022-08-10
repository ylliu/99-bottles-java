class BottleNumber {
    private int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public int successor(int number) {
        return number - 1;
    }

    public String action() {
        return "Take " + pronoun() + " down and pass it around, ";
    }

    public String quantity() {
        return String.valueOf(this.number);
    }

    public String pronoun() {
        if (this.number == 1) {
            return "it";
        }
        return "one";
    }

    public String container() {
        if (this.number == 1) {
            return "bottle";
        }
        return "bottles";
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

    public int successor(int number) {
        return 99;
    }
}
