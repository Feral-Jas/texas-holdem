package model;

import constant.Constants;
import exception.InvalidPokerException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Hand {
    private ArrayList<Poker> pokers = new ArrayList<>();
    private HashSet<Integer> colors = new HashSet<>();
    private boolean isSuited;

    public Hand(ArrayList<Poker> pokers) {
        this.pokers = pokers;
    }

    public Hand() {
    }


    public Hand draw(Poker poker){
        if(!poker.isValid()){
            throw new InvalidPokerException();
        }
        pokers.add(poker);
        colors.add(poker.getColor());
        isSuited = colors.size() == 1;
        return this;
    }

    public Result analyze(){
        int[] points = pokers.stream()
                .sorted(Comparator.comparingInt(Poker::getPoint))
                .mapToInt(Poker::getPoint)
                .toArray();
        switch (resultType(points)){
            case 1:return isSuited?Result.SUITED:Result.OFF_SUIT;
            case 2:return Result.PAIR;
            case 3:return isSuited?Result.STRAIGHT_FLUSH:Result.STRAIGHT;
            case 4:return isSuited?Result.ROYAL_THREE:Result.THREE_OF_A_KIND;
        }
        return Result.UNDEFINED;
    }

    public int resultType(int[] points){
        if(points[0]==points[1]-1&&points[1]==points[2]-1){
            return Constants.STRAIGHT;
        }else if(points[0]==points[1]&&points[1]==points[2]){
            return Constants.THREE;
        }else if(points[0]==points[1]||points[1]==points[2]){
            return Constants.PAIR;
        }else{
            return Constants.SINGLE;
        }
    }
}
