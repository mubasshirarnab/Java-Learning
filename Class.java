package PracticeForCT1;

public class Class {
    public String name;
    private int id;
    private double cgpa;

    public Class(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getCgpa(){
        return cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    public void printDetails(){
        System.out.println("Name: " + name + "\nID: " + id + "\nCGPA: " + cgpa + "\n");
    }
}

class School{
    public static void main(String[] args) {
        Class[] student = new Class[5];

        student[0] = new Class("Sayem", 123, 3.67);
        student[1] = new Class("Tanjim", 223, 2.67);
        student[2] = new Class("Monirul", 124, 3.33);
        student[3] = new Class("Ashik", 125, 3.51);
        student[4] = new Class("Arnab", 263, 3.00);

        for (int i =0; i < student.length; i++){
            student[i].printDetails();
        }
    }
}
