import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCloning {

    /**
     * Prototype allows us to hide the complexity of making new instances from the client.
     * The concept is to copy an existing object rather than creating a new instance from scratch.
     *
     * Creating new objects (instances) by cloning (copying) other objects.
     * Useful when there are numerous potential classes that you want to only use if needed at runtime.
     *
     */
    public static void main(String[] args) {

        Sheep sally = new Sheep();
        System.out.println("Sally hashcode: " + sally.hashCode());
        System.out.println(sally);

        List<Animal> clones = makeClones(sally);
        clones.forEach(clonedAnimal -> {
            System.out.println(clonedAnimal + ": hashcode: " + clonedAnimal.hashCode());
        });
    }

    public static List<Animal> makeClones(Sheep sheep) {
        CloneFactory animalMaker = new CloneFactory();
        System.out.print("How many clones? ");
        Scanner scanner = new Scanner(System.in);
        int clones = scanner.nextInt();
        List<Animal> clonedAnimals = new ArrayList<>();
        for (int i = 0; i < clones; i++) {
            clonedAnimals.add(animalMaker.getClone(sheep));
        }
        scanner.close();
        return clonedAnimals;
    }
}
