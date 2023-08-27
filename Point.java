import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

 class Main1 {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point(3, 5));
        points.add(new Point(1, 2));
        points.add(new Point(6, 1));
        points.add(new Point(4, 4));

        Comparator<Point> comparator = (p1, p2) -> {
            int sum1 = p1.x + p1.y;
            int sum2 = p2.x + p2.y;
            return Integer.compare(sum2, sum1);
        };

        Collections.sort(points, comparator);

        for (Point point : points) {
            System.out.println("x: " + point.x + ", y: " + point.y);
        }
    }
}

