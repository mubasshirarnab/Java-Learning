package ArrayProblem;

import java.util.Scanner;

public class SumofSameIndexNumofTwoArray {
    public static void main(String[] args) {
        int i, n, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element: ");
        n = sc.nextInt();
        int[]firstArray = new int[n];
        int[]secondArray = new int[n];
        int[]sumOfTwoArray = new int[n];

        System.out.println("Enter the first Array's Elements: ");
        for(i=0; i<n; i++){
            firstArray[i] = sc.nextInt();
        }
        System.out.println("Enter the Second Array's Elements: ");
        for(i=0; i<n; i++){
            secondArray[i] = sc.nextInt();
        }

        for (i=0; i<n; i++){
            sumOfTwoArray[i] = firstArray[i] + secondArray[i];
        }

        System.out.println("The Sum of the same indexed number from Two Array: ");
        for (i=0; i<n; i++){
            System.out.print(sumOfTwoArray[i] + " ");
        }
    }
}
