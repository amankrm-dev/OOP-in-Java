package Chapter2_TokensExpressionsAndControlStructures;

import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int search;
        int flag = 0; //assume search not found
        System.out.println("Search For: ? ");
        search = sc.nextInt();
        for (int i : arr) {
            if (search == i) {
                flag = 1;
                System.out.println("Search Found! =" + search);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Search Not Found ");
        }

    }

}
                 
