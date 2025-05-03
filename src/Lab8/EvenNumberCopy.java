package Lab8;

import java.io.*;

public class EvenNumberCopy {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("hsm.txt"));
        for (int i = 1; i <= 10; i++) {
            writer.write(i + "\n");
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("hsm.txt"));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            int num = Integer.parseInt(line);
            if (num % 2 == 0) {
                evenWriter.write(num + "\n");
            }
        }

        reader.close();
        evenWriter.close();
        System.out.println("Even numbers copied to even.txt");
    }
}