package ArrayProblem;

import java.sql.Array;
import java.util.Scanner;

public class sumOfMainDaigonal {
    public static void main(String[] args) {
        int i, j, n, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n: ");
        n = sc.nextInt();
        int[][]Array = new int[n][n];

        System.out.println("Enter the Array Elements: ");
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.format("Element [%d] [%d] : ", i, j);
                Array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array:");
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                if (i == j){
                    sum+=Array[i][j];
                }
            }
        }

        System.out.println("The Sum of the main Diagonal is: " + sum);

    }
}

