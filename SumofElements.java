package ArrayProblem;

import java.util.Scanner;

public class SumofElements {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int[] array = new int[n];

        for (i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("The sum is: " + sum);
    }
}
