package LabManual;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {

        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];

        for (i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int max, min;
        max = min = array[0];
        for (i = 1; i < n; i++){
            if (array[i]>max){
                max = array[i];
            }
            else if (array[i]<min){
                min = array[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
