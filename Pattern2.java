import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of term: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = i; j<i+n; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
