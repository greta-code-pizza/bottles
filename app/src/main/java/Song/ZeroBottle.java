package Song;

public class ZeroBottle extends Bottle {

    ZeroBottle() {
        super(0);
    }

    String remaining() {
        return "no more";
    }

    String action() {
        return "Go to the store and buy some more,";
    }
}
