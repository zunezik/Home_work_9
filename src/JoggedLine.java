import java.util.List;

public class JoggedLine {

    public static String printLength(List points) {
        double lineLength = 0;
        Point p1 = new Point();
        Point p2 = new Point();
        for (int i = 0; i < points.size() - 1; i++) {
            p1 = (Point) points.get(i);
            p2 = (Point) points.get(i + 1);
            lineLength += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        String str = Double.toString(lineLength);
        return str;
    }
}