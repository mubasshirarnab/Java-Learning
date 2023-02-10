package ArrayProblem;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class SumofEvenIndex {
    public static void main(String[] args) {
        int i, n, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        int[] array = new int[n];

        for(i=0; i<n; i++){
            array[i] = sc.nextInt();
            if(i % 2 == 0){
                sum+=array[i];
            }
        }

        System.out.println("The Sum of Even Indexed number is: " + sum);
    }
}
