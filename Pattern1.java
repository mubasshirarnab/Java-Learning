package Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int n, i, j, space;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
            for (space = i; space < n; space++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
