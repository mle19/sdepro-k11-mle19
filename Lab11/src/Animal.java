public abstract class Animal {
    //public Animal(){};
    public int speed;
    public String name;

    public abstract String getName();

    public abstract String setName(String name);

    public abstract int getSpeed();

    public abstract int setSpeed(int speed);

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
