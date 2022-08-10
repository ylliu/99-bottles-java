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

    public String action() {
        if (this.number == 0) {
            return "Go to the store and buy some more, ";
        }
        return "Take " + pronoun() + " down and pass it around, ";
    }

    public String quantity() {
        if (this.number == 0) {
            return "no more";
        }
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
