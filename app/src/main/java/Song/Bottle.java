package Song;

import java.lang.UnsupportedOperationException;

public class Bottle {
    public String verses(int from, int to) {
        String song = "";
        for (int i = to; i < from + 1; i++) {
            int currentNb = from - i;
            song += verse(currentNb);
        }

        return song;
    }

    public String verse(int number) {
        String res;

        if(number == 0) {
            res =
                    "No more bottles of beer on the wall, no more bottles of beer.\n"
                    + "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        } else if(number == 1) {
            res =
                    "1 bottle of beer on the wall, 1 bottle of beer.\n"
                    + "Take it down and pass it around, no more bottles of beer on the wall.\n";
        } else if(number == 2) {
            res =
                    number + " bottles of beer on the wall, " + number + " bottles of beer.\n"
                    + "Take one down and pass it around, 1 bottle of beer on the wall.\n";
        } else if (number > 2 && number < 100) {
            res =
                    number + " bottles of beer on the wall, " + number + " bottles of beer.\n"
                    + "Take one down and pass it around, " + (number - 1) + " bottles of beer on the wall.\n";
        } else {
            throw new UnsupportedOperationException();
        }

        return res;
    }
}