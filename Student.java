public class Student implements Comparable<Student>{
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Id= " + id + "\n" +
                "Cgpa= " + cgpa + "\n";
    }

    @Override
    public int compareTo(Student o) {
        //return this.name.compareTo(o.name); // Ascending  ("this" with "Student o")
        return o.name.compareTo(this.name); // descending  ("Student o" with "this")
    }
}
