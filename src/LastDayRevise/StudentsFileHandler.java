package LastDayRevise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students {
    String name;
    int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentsFileHandler {
    public static void main(String[] args) throws Exception {
        // Writing student data to the file
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("Ram,22\n");
        bw.write("Shyam,20\n");
        bw.write("Hari,23\n");
        bw.close();

        // Reading data from the file
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        List<Students> std = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                std.add(new Students(parts[0], Integer.parseInt(parts[1])));
            }
        }
        br.close();

        // Sorting students by age
        std.sort(Comparator.comparingInt(s -> s.age));

        // Displaying sorted records
        for (Students s : std) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}
