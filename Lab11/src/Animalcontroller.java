import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class Animalcontroller {
    public String Findmax(List<Animal> animalList) {
        int max = animalList.get(0).speed;
        String winner = animalList.get(0).name;
        int i = 0;
        for (Animal a : animalList) {
            if (max < a.speed) {
                max = a.speed;
                winner = a.name;
            }

        }
        //System.out.println(anm.indexOf(max));
        return winner;
    }
}
