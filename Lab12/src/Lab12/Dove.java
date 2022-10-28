package Lab12;

public class Dove implements MoveAble, FlyAble{
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
        return flyable() + ", " + speed();
    }
}
