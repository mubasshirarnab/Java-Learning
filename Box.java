package LabManual;

import java.util.Scanner;

public class Box {
    Scanner sc = new Scanner(System.in);
    public float length = sc.nextFloat();
    public float height = sc.nextFloat();
    public float width = sc.nextFloat();

    public float getVolume(){
        float volume;

        volume = length * height * width;

        return volume;
    }
}
class Calculation{
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box();

        System.out.println("The volume of Box-1 is: "+ a.getVolume());
        System.out.println("The volume of Box-2 is: "+ b.getVolume());
    }
}
