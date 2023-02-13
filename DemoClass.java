package classdemo;

public class DemoClass {
    int a;

    void setA(int a){
        this.a = a;
    }

    int getA(){
        return a;
    }

    void printInteger(){
        System.out.println("Value of a is: " + a);
    }

    public static void main(String[] args) {
        DemoClass var;
        var = new DemoClass();

        var.a = 20;

        System.out.println(var.a);

        var.a = 30;
        System.out.println(var.a);

        var.printInteger();

        int b = 50;
        var.setA(b);
        var.printInteger();

        System.out.println(var.getA());
    }
}
