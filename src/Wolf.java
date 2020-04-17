import java.util.Random;

public class Wolf extends Canine {
    int skullSize;
    boolean isCarnivore;

    public boolean howling(boolean isFullMoon) {
        return isFullMoon;
    }

    public boolean preyLarge(boolean isGroup) {
        return isGroup;
    }
    public static int speedRange(int start) {
        int s;
        Random r = new Random();
        s = r.nextInt(10 + 1) + start;
        return s;
    }
}
