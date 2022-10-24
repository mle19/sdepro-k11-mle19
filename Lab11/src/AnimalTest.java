import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName(dog.getName());
        dog.setSpeed(dog.getSpeed());
        Animal cat = new Cat();
        cat.setName(cat.getName());
        cat.setSpeed(cat.getSpeed());
        Animal tiger = new Tiger();
        tiger.setName(tiger.getName());
        tiger.setSpeed(tiger.getSpeed());
        List<Animal> anm = Arrays.asList(dog,cat,tiger);
        System.out.println(anm);
        String winnername = new Animalcontroller().Findmax(anm);
        System.out.println("The winner is: " + winnername);
    }
}
