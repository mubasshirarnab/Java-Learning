public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, String id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + calculateSalary());
    }
}

class HourlySalariedEmployee extends Employee {
    private double hourlySalary;
    private double hoursWorked;

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public HourlySalariedEmployee(String name, String id, double hourlySalary, double hoursWorked) {
        super(name, id);
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlySalary * hoursWorked;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + calculateSalary());
    }
}

class CommissionedEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    private int productsSold;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getProductsSold() {
        return productsSold;
    }

    public void setProductsSold(int productsSold) {
        this.productsSold = productsSold;
    }

    public CommissionedEmployee(String name, String id, double baseSalary, double commissionRate, int productsSold) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.productsSold = productsSold;
    }

    public double calculateSalary() {
        return baseSalary + commissionRate * productsSold;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + calculateSalary());
    }
}

class Main5 {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "EMP01", 5000.0);
        salariedEmployee.displayInfo();

        HourlySalariedEmployee hourlySalariedEmployee = new HourlySalariedEmployee("Karim", "EMP02", 15.0, 40.0);
        hourlySalariedEmployee.displayInfo();

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Karim Benzema", "EMP03", 3000.0, 100.0, 10);
        commissionedEmployee.displayInfo();
    }
}



