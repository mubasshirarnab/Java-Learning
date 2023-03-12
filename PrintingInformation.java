package ClassRelatedProblems;

import java.util.Scanner;

public class PrintingInformation {


    String name;
    int year;
    String address;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
class Employee{
    public static void main(String[] args) {
        PrintingInformation person1 = new PrintingInformation();

        Scanner sc = new Scanner(System.in);


        person1.setName(person1.name = sc.nextLine());
        person1.setYear(person1.year = sc.nextInt());
        sc.nextLine();
        person1.setAddress(person1.address = sc.nextLine());

        System.out.println("Name" + "      "+ "Year" + "      " + "Address");
        System.out.println(person1.getName() + "      " + person1.getYear() + "      " + person1.getAddress());
    }
}
