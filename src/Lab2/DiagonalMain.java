package Lab2;

import java.util.Scanner;

public class DiagonalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Enter three values to replace:");
        for (int i = 0; i < 3; i++) {
            int temp = sc.nextInt();
            a[i][i] = temp;

        }
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
