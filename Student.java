public class Student {
    // Instance variables
    public String name;
    public String id;
    public float cgpa;
    public int creditCompleted;

    // Constructor – we will discuss later
    /*public Student(String name, String id, float cgpa, int creditCompleted) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.creditCompleted = creditCompleted;
    }*/

    public void updateCgpa(int credit, float gpa) {
        cgpa = (cgpa * creditCompleted + credit * gpa) / (creditCompleted + credit);
        creditCompleted = creditCompleted + credit;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void printStudent(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credit: " + creditCompleted);
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student std1, std2;
        std1 = new Student();
        std2 = new Student();

        std1.name = "Rahim";
        std1.id = "011222263";
        std1.cgpa = 3.33f;
        std1.creditCompleted = 18;

        System.out.println(std1.name+"\n" + std1.id+"\n" + std1.cgpa+"\n" + std1.creditCompleted);

        std2.name = "Karim";
        std2.id = "011222264";
        std2.cgpa = 3.67f;
        std2.creditCompleted = 20;

        System.out.println(std2.name+"\n" + std2.id+"\n" + std2.cgpa+"\n" + std2.creditCompleted);

        std1.printStudent();
        System.out.println("");
        std2.printStudent();
    }

}