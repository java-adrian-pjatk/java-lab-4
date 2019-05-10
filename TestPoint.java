/*Zadanie 3: Point and MovablePoint
 * Wykonali:
 * Filip Bianga
 * Adrian Witkowski*/

public class TestPoint {
    public static void main (String [] args){
        Point pkt = new Point (32, 45);
        System.out.println(pkt);
        MovablePoint mpkt = new MovablePoint(51,65);
        System.out.println(mpkt);

        pkt.setX(5);
        pkt.setY(7);
        pkt.setXY(7,9);
        System.out.println("x = " + pkt.getX() + ", y = " + pkt.getY() + ", x i y = " + pkt.getXY());

        mpkt.setxSpeed(5);
        mpkt.setySpeed(7);
        mpkt.setSpeed(7,9);
        mpkt.move();
        System.out.println("x speed = " + mpkt.getxSpeed() + ", y speed = " + mpkt.getySpeed() + ", speed = " + mpkt.getSpeed() + ", move  " + mpkt.move());
    }
}
