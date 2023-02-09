package ArrayProblem;

import java.util.Scanner;

public class AverageOfFlotingElements {
    public static void main(String[] args) {
        int i, n;
        float sum = 0.0f, avg;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        n = sc.nextInt();
        float[] array = new float[n];

        for (i=0; i<n; i++){
            array[i] = sc.nextFloat();
            sum = sum + array[i];
        }

        avg = sum / n;

        System.out.println("The Average is: " + avg);
    }
}
