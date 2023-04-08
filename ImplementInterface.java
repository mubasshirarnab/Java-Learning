package Interface;

public interface ImplementInterface {
    int a = 10, b = 15;

    int addNumber(int a, int b);
    void showDetails();
}

class Interface implements ImplementInterface{
    int x,y;
    public Interface(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int addNumber(int x, int y){
        return x + y;
    }
    @Override
    public void showDetails() {
        System.out.printf("I'm Interface's Method in Class\n");
    }
}

class Test {
    public static void main(String[] args) {
        Interface I = new Interface(10,15);
        I.showDetails();
        System.out.println(I.addNumber(ImplementInterface.a,ImplementInterface.b));
    }
}
