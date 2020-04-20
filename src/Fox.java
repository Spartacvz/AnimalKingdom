import java.util.Random;

public class Fox extends Canine {
    boolean solitary;
    boolean isOmnivore;

    public boolean tchoffo(boolean otherFox) {
        return otherFox;
    }

    public boolean Prey(int animalWeight, int n) {
        return animalWeight < n;
    }

    public static int speedRange(int start) {
        int s;
        Random r = new Random();
        s = r.nextInt(10 + 1) + start;
        return s;
    }
}
