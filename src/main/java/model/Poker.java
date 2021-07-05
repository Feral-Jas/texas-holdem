package model;

public class Poker {
    private int point;
    private int color;
    public Poker(int point, int color) {
        this.point = point;
        this.color = color;
    }
    public int getPoint() {
        return point;
    }

    public int getColor() {
        return color;
    }


    public boolean isValid(){
        if(getColor()>=1&&getColor()<=4&&getPoint()>=1&&getPoint()<=13){
            return true;
        }else{
            return false;
        }
    }
}
