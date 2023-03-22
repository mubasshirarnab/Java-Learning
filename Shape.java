package AbstractClass;

public abstract class Shape {
    int dim1;
    int dim2;

    public Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public Shape(int dim1){
        this.dim1 = dim1;
    }

    abstract void printArea();
}

class Rectangle extends Shape{
    public Rectangle(int dim1, int dim2){
        super(dim1,dim2);
    }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("The Area of the Rectangle is: " + area);
    }
}

class Triangle extends Shape{
    public Triangle(int dim1, int dim2){
        super(dim1,dim2);
    }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("The Area of the Triangle is: " + area);
    }
}

class Circle extends Shape {
    public Circle(int dim1){
        super(dim1);
    }

    @Override
    void printArea() {
        double area = 3.1416 * (dim1 * dim1);
        System.out.println("The area of the Circle is: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,20);
        rectangle.printArea();

        Shape triangle = new Triangle(10,5);
        triangle.printArea();
        
        Shape circle = new Circle(5);
        circle.printArea();
    }
}
