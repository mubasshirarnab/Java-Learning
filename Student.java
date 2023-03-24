package AbstractClass;

/*  We have to calculate the percentage of marks obtained in three subjects (each out of 100)
    by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Student'
    with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having
    a method with the same name which returns the percentage of the students. The constructor of student A
    takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
    Create an object for eac of the two classes and print the percentage of marks for both the students. */

public abstract class Student {
    double marksPhysics;
    double marksChemistry;
    double marksMath;
    double marksBiology;

    public Student(double marksPhysics, double marksChemistry, double marksMath){
        this.marksPhysics = marksPhysics;
        this.marksChemistry = marksChemistry;
        this.marksMath = marksMath;
    }

    public Student(double marksPhysics, double marksChemistry, double marksMath, double marksBiology){
        this.marksPhysics = marksPhysics;
        this.marksChemistry = marksChemistry;
        this.marksMath = marksMath;
        this.marksBiology = marksBiology;
    }

    abstract double getPercentage();

}

class StudentA extends Student{
    public StudentA(double marksPhysics, double marksChemistry, double marksMath){
        super(marksPhysics,marksChemistry,marksMath);
    }

    @Override
    double getPercentage() {
        return ((marksPhysics + marksChemistry + marksMath) / 300) * 100;
    }
}

class StudentB extends Student{
    public StudentB(double marksPhysics, double marksChemistry, double marksMath, double marksBiology){
        super(marksPhysics, marksChemistry,marksMath,marksBiology);
    }

    @Override
    double getPercentage() {
        return ((marksPhysics + marksChemistry + marksMath + marksBiology) / 400) * 100;
    }
}

class MarksPercentage{
    public static void main(String[] args) {
        Student studentA = new StudentA(78,86,82);
        System.out.println("The obtained mark percentage of Student A : " + studentA.getPercentage());

        Student studentB = new StudentB(87,85,81,90);
        System.out.println("The obtained mark percentage of Student B : " + studentB.getPercentage());
    }
}
