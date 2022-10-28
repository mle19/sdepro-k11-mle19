package Lab12;

public class Horse implements MoveAble, FlyAble{
    String name = "Horse";

    public String getName() {
        return name;
    }

    @Override
    public boolean flyable() {
        return false;
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
