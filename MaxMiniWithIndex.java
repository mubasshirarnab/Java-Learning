package ArrayProblem;

import java.util.Scanner;

public class MaxMiniWithIndex {
    public static void main(String[] args) {
        int i, n, max, max_I = 0, mini, mini_I = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        n = sc.nextInt();
        int[]array = new int[n];

        System.out.println("Enter the Array's Elements: ");
        for (i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        max = mini = array[0];
        for (i = 1; i < n; i++){
            if(array[i]>max){
                max = array[i];
                max_I = i;
            }
            else if (mini>array[i]) {
                mini = array[i];
                mini_I = i;
            }
        }

        System.out.println("Maximum value: " + max + "    " + "Index: " + max_I);
        System.out.println("Minimum value: " + mini + "    " + "Index: " + mini_I);
    }
}
