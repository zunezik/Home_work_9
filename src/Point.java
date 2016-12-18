import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public void addPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String text = "x: " + x + ", y: " + y;
        return text;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}
