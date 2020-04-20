public class Canine {
    int legLength;
    boolean isPeopleShy;
    boolean isPredator;



    public static boolean winterCoat(int temp, int n) {
        return temp < n;
    }

    public static boolean isSleep(boolean isFull) {
        return isFull;
    }

    public static void k9Speeds() {
        System.out.println("Wolf speed is: " + Wolf.speedRange(30));
        System.out.println("Dog speed is: " + Dog.speedRange(35));
        System.out.println("Fox speed is: " + Fox.speedRange(25));
    }
}
