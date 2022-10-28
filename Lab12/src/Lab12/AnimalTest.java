package Lab12;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalController racers = new AnimalController();
        Dog dog = new Dog();
        Dove dove = new Dove();
        Horse horse = new Horse();
        List fly123 = racers.fly(Arrays.asList(dog, dove, horse));
        System.out.println(fly123);
        MoveAble winner = racers.getWinner(fly123);
        System.out.println("The winner is " + winner);

    }
}
