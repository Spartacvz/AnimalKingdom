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
}
