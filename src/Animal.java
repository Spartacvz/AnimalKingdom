import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class Animal {
    public static void main(String[] args) {
        // Declare variable to input species selection from species method
        String species = Species();
        String speciesName;

        // Call method from other classes that displays animal speeds
        Canine.k9Speeds();

        // Create scanner to accept input
        Scanner user = new Scanner(System.in);
        System.out.print("A species has been generated at random for you, you've been awarded a " + species +
                ". Pick a name for your species!");
        System.out.println();
        speciesName = user.nextLine();
        System.out.println("You have chosen the name " + speciesName + " for your " + species + ".");
        System.out.println("Your species top speed is " + SpeciesSpeed(species) + ".");
    }

    public static String Species() {
        String[] species = {"Dragon", "Phoenix", "Sphinx", "Minotaur", "Centaur", "Faun", "Griffin", "Basilisk",
                "Harpy", "Werewolf", "Cerberus", "Hydra", "Unicorn", "Pegasus",};

        Random r = new Random();
        int s = r.nextInt(14);
        return species[s];
    }

    public static int SpeciesSpeed(String s) {
        HashMap<String, Integer> speeds = new HashMap<>();
        speeds.put("Dragon", 150);
        speeds.put("Phoenix", 200);
        speeds.put("Sphinx", 55);
        speeds.put("Minotaur", 50);
        speeds.put("Centaur", 60);
        speeds.put("Faun", 35);
        speeds.put("Griffin", 75);
        speeds.put("Basilisk", 25);
        speeds.put("Harpy", 100);
        speeds.put("Werewolf", 65);
        speeds.put("Cerberus", 55);
        speeds.put("Hydra", 30);
        speeds.put("Unicorn", 60);
        speeds.put("Pegasus", 80);

        return speeds.get(s);
    }
}
