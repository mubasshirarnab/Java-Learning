public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println("Student " + name + " is studying.");
    }
}

class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teacher " + name + " is teaching " + subject + ".");
    }
}

class Main2 {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.displayInfo();

        Student student = new Student("Rahim", 20, 123456);
        student.displayInfo();
        student.study();

        Teacher teacher = new Teacher("Karim", 35, "Mathematics");
        teacher.displayInfo();
        teacher.teach();
    }
}



