package Practic2;

    public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    private double speed = 0.0;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(double x, double y, double speed){
            this.x = x;
            this.y = y;
            this.speed = speed;
    }
    public Ball() {}
        public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getSpeed(){
        return speed;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setXYSpeed(double x, double y, double speed){
            this.x = x;
            this.y = y;
            this.speed = speed;
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+")."+ " Speed of ball =  "+this.speed+"."; }
}
