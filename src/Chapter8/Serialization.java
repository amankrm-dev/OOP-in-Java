package Chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;

    }
}

public class Serialization {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String path = "D:\\Java.AK";
        Student[] s;
        try (FileOutputStream fos = new FileOutputStream(path + "\\student.ser"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            s = new Student[]{
                new Student(101, "Aman"),
                new Student(102, "Ankit"),
                new Student(103, "Riyaz"),
                new Student(104, "Rabin"),
                new Student(105, "Suroj")
            };
            for (Student obj : s) {
                oos.writeObject(obj);
            }
            System.out.println("Object written to file");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // DE SERIALIZATION
        try (FileInputStream fis = new FileInputStream(path + "\\student.ser"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("Decentralized students:");
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    System.out.println("ID: " + student.id + ", Name: " + student.name);
                } catch (IOException e) {
                    break; // End of file reached
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}