package pattern;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers in the first half
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers in the second half
            for (int j = 0; j <=i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
