package model;

import constant.Constants;

public enum Result {
    /**
     * 同花豹子 Royal Three
     * 豹子 three of a kind
     * 同花顺 straight flush
     * 顺子 straight
     * 对子 pair
     * 同花单牌 suited
     * 单牌 off suit
     */
    ROYAL_THREE(1,4),
    THREE_OF_A_KIND(0,4),
    STRAIGHT_FLUSH(1,3),
    STRAIGHT(0,3),
    PAIR(0,2),
    SUITED(1,1),
    OFF_SUIT(0,1),
    UNDEFINED(0,0);

    Result(int suited,int point) {
        this.suited = suited==1;
        total = suited+point;
        switch (point){
            default:type="undefined type";break;
            case 1:type=suited==1?"suited":"off_suited";break;
            case 2:type="pair";break;
            case 3:type=suited==1?"straight flush":"straight";break;
            case 4:type=suited==1?"royal three":"three";break;
        }
    }
    private boolean suited;

    public boolean isSuited() {
        return suited;
    }

    private int total;

    public String showResult() {
        String out = type+"---"+total+"points\n";
        System.out.print(out);
        return out;
    }

    private String type;

    public String getType() {
        return type;
    }

    public int getTotal(){
        return total;
    }
    public int compare(Result result){
        int compared;
        String comparedWord;
        if (getTotal()==result.getTotal()&&suited== result.isSuited()){
            compared = Constants.EQUAL;
            comparedWord = " equals ";
        }else if (getTotal()==result.getTotal()){
           if(suited){
               compared = Constants.GREATER;
               comparedWord = " greater than ";
           }else{
               compared = Constants.LESS;
               comparedWord = " less than ";
           }
        }else if(getTotal()>result.getTotal()){
            compared = Constants.GREATER;
            comparedWord = " greater than ";
        }else{
            compared = Constants.LESS;
            comparedWord = " less than ";
        }
        System.out.println(getType()+comparedWord+result.getType());
        return compared;
    }
}
