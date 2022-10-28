package Lab12;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public List<FlyAble> fly(List<FlyAble> flyAbleList){
        List<FlyAble> finalracers = new ArrayList<>();
        for (FlyAble anm : flyAbleList) {
            if(!anm.flyable()){
                 finalracers.add(anm);
            }
        }
        return finalracers;
    }
    public MoveAble getWinner(List<MoveAble> moveAbleList){
        MoveAble winner = moveAbleList.get(0);
        for(MoveAble moveamn : moveAbleList){
            if(moveamn.speed() > winner.speed()){
                winner = moveamn;
            }
        }
        return winner;
    }
}
