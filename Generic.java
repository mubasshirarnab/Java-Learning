package Collections;

public class Generic <T> {
    T thingsToPrint;

    public Generic(T thingsToPrint){
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }
}

class Test {
    public static void main(String[] args) {
        Generic<Integer> name = new Generic<>(20);
        name.print();
    }
}