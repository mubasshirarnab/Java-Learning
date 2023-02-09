package LabManual;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n, i, rem, count = 0;
        int[] array = new int[16];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        n = sc.nextInt();

       while (n!=0){
           rem = n % 2;
           array[count] = rem;
           n = n / 2;
           count++;
       }
        System.out.println("The Binary Conversion is: ");
        for (i = array.length - 1; i >= 0; i--){
            System.out.print(array[i]);
        }
    }
}
