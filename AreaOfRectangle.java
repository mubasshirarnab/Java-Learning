package ClassRelatedProblems;

import java.util.Scanner;

public class AreaOfRectangle {

    Scanner sc = new Scanner(System.in);

    static {
        System.out.println("Enter the Length and Width: ");
    }
    float length = sc.nextFloat();
    float width = sc.nextFloat();

    public void setDim(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getArea(){
        float area;
        area = length * width;
        return  area;
    }
}

class Area{
    public static void main(String[] args) {
        AreaOfRectangle a = new AreaOfRectangle();

        a.setDim(a.length,a.width);
        System.out.println("The Area is: " + a.getArea());
    }

}
