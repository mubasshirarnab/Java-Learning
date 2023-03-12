import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The Sum is:" + sum);
    }
}
