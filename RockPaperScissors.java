package fr.p10.miage.rps.model;

/**
 * Created by fodoucou on 27/09/2016.
 */
public class RockPaperScissors {

    public RockPaperScissors(){

    }

    public Result play(RPSEnum p1, RPSEnum p2){
        if(p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.ROCK)){
            return Result.WIN;
        }
        else if(p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.PAPER)){
            return Result.TIE;
        }
        else if(p1.equals(RPSEnum.SCISSORS) && p2.equals(RPSEnum.PAPER)){
            return Result.LOST;
        }
        else{
            return Result.LOST;
        }
    }


}
