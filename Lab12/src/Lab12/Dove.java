package Lab12;

public class Dove implements MoveAble, FlyAble{
    String name = "Dove";


    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    public int speed() {
        return 70;
    }

    @Override
    public String toString() {
        return name + " with " + speed() + " km/h";
    }
}
