package Practic2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        Ball b2 = new Ball();
        System.out.println(b2);
        b2.move(22, 11);
        System.out.println(b2);
        Ball b3 = new Ball(190, 30, 60);
        System.out.println(b3);
        b3.move(60, 0);
        System.out.println(b3);
        b3.move(0, 60);
        System.out.println(b3);
        Ball b4 = new Ball(1,1);
        System.out.println(b4);
        b4.setXYSpeed(222, 21, 134);
        System.out.println(b4);
        Ball b5 = new Ball(1,1);
        System.out.println(b5);
        b5.setX(190);
        System.out.println(b5);
        b5.setY(99);
        System.out.println(b5);
        b5.setXY(1,1);
        System.out.println(b5);
        System.out.println("b5 " +b5.getX() + " , " + b5.getY()+ " , " + b5.getSpeed()+ ".");




    }
}