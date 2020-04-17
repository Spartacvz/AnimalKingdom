import java.util.Random;

public class Dog extends Canine {
    int weight;
    boolean isDomesticated;


    public boolean barking(boolean isStranger) {
        return isStranger;
    }

    public boolean chase(boolean isSquirrel) {
        return isSquirrel;
    }
    public static int speedRange(int start) {
        int s;
        Random r = new Random();
        s = r.nextInt(10 + 1) + start;
        return s;
    }
}
