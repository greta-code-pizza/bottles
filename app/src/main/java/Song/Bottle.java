package Song;

public class Bottle {
    static Bottle factory(int number) {
        if(number == 0) {
            return new ZeroBottle();
        }else if(number == 1) {
            return new OneBottle();
        } else {
            return new Bottle(number);
        }
    }

    static String capitalize(String remaining) {
        return remaining.substring(0,1).toUpperCase() + remaining.substring(1).toLowerCase();
    }

    private int number;

    Bottle(int number) {
        this.number = number;
    }

    String containers() {
        return "bottles";
    }

    String pronoun() {
        return "one";
    }

    String remaining() {
        if(this.number == -1){
            return "99";
        } else {
            return String.valueOf(this.number);
        }
    }

    String action() {
        return "Take " + pronoun() + " down and pass it around,";
    }
}