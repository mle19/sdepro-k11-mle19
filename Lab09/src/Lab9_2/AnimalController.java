package Lab9_2;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public int Findmax(List<Animal> animalList) {
        Animal horse = new Horse();
        horse.setName("Horse");
        horse.setSpeed(new SecureRandom().nextInt(60));
        Animal dog = new Dog();
        dog.setName("Dog");
        dog.setSpeed(new SecureRandom().nextInt(100));
        Animal tiger = new Tiger();
        tiger.setName("Tiger");
        tiger.setSpeed(new SecureRandom().nextInt(200));
        List<Animal> anm = Arrays.asList(horse, dog, tiger);
        System.out.println(anm);
        int max = anm.get(0).getSpeed();
        int i = 0;
        for (Animal a : anm) {
            if (max < a.getSpeed()) {
                max = a.getSpeed();
            }

        }
        //System.out.println(anm.indexOf(max));
        return max;
    }

}
