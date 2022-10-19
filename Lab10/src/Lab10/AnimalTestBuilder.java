package Lab10;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Lab10.Animal.Builder;
public class AnimalTestBuilder {
    public static void main(String[] args) {
        Builder builder1 = new Builder();
        builder1.setName("dove");
        builder1.setSpeed(new SecureRandom().nextInt(100));;
        builder1.setWing(true);
        Animal bird = builder1.build();

        Builder builder2 = new Builder();
        builder2.setName("dog");
        builder2.setSpeed(new SecureRandom().nextInt(100));;
        builder2.setWing(false);
        Animal dog = builder2.build();

        Builder builder3 = new Builder();
        builder3.setName("cat");
        builder3.setSpeed(new SecureRandom().nextInt(100));;
        builder3.setWing(false);
        Animal cat = builder3.build();

        List<Animal> animalList = Arrays.asList(bird,dog,cat);
        List<Animal> a = new Builder().ValidateIswing(animalList);
        System.out.println(a);
        String anm = new Builder().maxwinner(a);
        System.out.println("The winner is: " + anm);


    }
}
