package Practic3.second;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3, 1, 2, 2);

        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}