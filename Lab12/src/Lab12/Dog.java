package Lab12;

public class Dog implements MoveAble, FlyAble{
    @Override
    public boolean flyable() {
        return false;
    }

    @Override
    public int speed() {
        return 40;
    }

    @Override
    public String toString() {
        return flyable() + ", " + speed();
    }
}
