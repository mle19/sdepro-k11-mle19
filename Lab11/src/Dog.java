import java.security.SecureRandom;

public class Dog extends Animal{


    @Override
    public String getName() {
        name = "Dog";
        return name;
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public int getSpeed() {
        speed = setSpeed(new SecureRandom().nextInt(60));
        return speed;
    }

    @Override
    public int setSpeed(int speed) {
        return speed;
    }
}
