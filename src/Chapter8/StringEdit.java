package Chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringEdit {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Java.AK";
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\string.txt"))) {

            String user_input = null;
            System.out.print("Enter any string :");
            user_input = sc.nextLine();
            for (String word : user_input.split(" ")) {
                if (word.startsWith("t")) {
                    bw.write(word+", ");
                }
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path + "\\string.txt"))) {
            String c;
            while ((c = br.readLine()) != null) {

                System.out.println(c);

            }
        }

    }
}
