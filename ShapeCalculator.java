public class ShapeCalculator {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public float calculateArea(float base, float height) {
        return 0.5f * base * height;
    }
}

class Main4 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Circle Area (double): " +calculator.calculateArea(5.0));

        System.out.println("Rectangle Area (int): " + calculator.calculateArea(4, 6));

        System.out.println("Triangle Area (float): " + calculator.calculateArea(3.0f, 8.0f));
    }
}


