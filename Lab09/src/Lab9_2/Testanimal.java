package Lab9_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testanimal {
    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();
        //Animal horse = new Horse();
        //horse.getName();
        //horse.getSpeed();
        //Animal dog = new Dog();
        //Animal tiger = new Tiger();
        //animalList = Arrays.asList(horse, dog, tiger);
        int speed = new AnimalController().Findmax(animalList);
        //System.out.println(animalList);
        //String winner = new AnimalController().Findwinner(animaList);
        System.out.println("The speed win is: " +speed);



    }
}
