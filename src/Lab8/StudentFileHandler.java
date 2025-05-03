package Lab8;

import java.io.*;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentFileHandler {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));
        writer.write("Ram,22\nShyam,20\nHari,21\nSita,19\nGita,23");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
        List<Student> students = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            students.add(new Student(parts[0], Integer.parseInt(parts[1])));
        }
        reader.close();

        students.sort(Comparator.comparingInt(s -> s.age));

        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}