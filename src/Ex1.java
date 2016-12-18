import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Point> points = new ArrayList<>();
        JoggedLine joggedLine = new JoggedLine();

        while (true) {
            System.out.println("==============================");
            System.out.println("1) Додати точку.             |");
            System.out.println("2) Показати всі точки.       |");
            System.out.println("3) Порахувати довжину ламаної|");
            System.out.println("4) Вихід.                    |");
            System.out.println("==============================");
            System.out.print("Ваш вибір: ");

            int choice = sc.nextInt();
            if (choice == 1) points.add(addPoint());
            if (choice == 2) printPoints(points);
            if (choice == 3) System.out.println("Довжина ламаної - " + joggedLine.printLength(points));
            if (choice == 4) System.exit(0);

        }
    }

    public static Point addPoint() {
        Point p = new Point();
        p.addPoint();
        return p;
    }

    public static void printPoints(List points) {
        for (int i = 0; i < points.size(); i++) {
            System.out.println(i + 1 + "-> " + points.get(i));
        }
    }

}
