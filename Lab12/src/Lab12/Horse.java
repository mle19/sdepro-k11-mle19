package Lab12;

public class Horse implements MoveAble, FlyAble{
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
        return flyable() + ", " + speed();
    }
}
