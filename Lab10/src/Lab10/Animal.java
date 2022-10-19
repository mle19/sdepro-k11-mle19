package Lab10;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private String name;
    private boolean wing;
    private int speed;

    private Animal(Builder builder){
        this.name = builder.name;
        this.wing = builder.wing;
        this.speed = builder.speed;

    }

    public String getName() {

        return name;
    }

    public boolean isWing() {
        return wing;
    }

    public int getSpeed() {
        return speed;
    }

    public static class Builder{
        private String name;
        private boolean wing;
        private int speed;

        public void setName(String name) {
            this.name = name;
        }

        public void setWing(boolean wing) {
            this.wing = wing;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public List<Animal> ValidateIswing(List<Animal> animalList){
            List<Animal> b = new ArrayList<>();
            for(Animal a: animalList){
                if(a.isWing() == false){
                    b.add(a);
                }
            }
            return b;
        }
        public String maxwinner(List<Animal> animalList){
            //List<Animal> a = new ArrayList<>();
            int max = animalList.get(0).getSpeed();
            String wname = animalList.get(0).getName();
            for(Animal b: animalList){
                if(max < b.getSpeed()){
                    max = b.getSpeed();
                    wname = b.getName();
                }
            }return wname;
        }



        public Animal build() {
            return new Animal(this);
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", wing=" + wing +
                ", speed=" + speed +
                '}';
    }
}
