package CoreConcepts;
import java.util.Scanner;

class Students {
    String name;
    int rollNo;
    float[] marks = new float[5];
    float average = 0;

    void StudentDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        name = sc.nextLine();
        System.out.print("Enter your RollNo:");
        rollNo = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your marks in subject: " + i);
            marks[i] = sc.nextFloat();
        }
        sc.close();
    }

    void AverageMarks() {
        for (int i = 0; i < 5; i++) {
            average += marks[i];
        }
        average /= 5;
        System.out.println("The Average marks in 5 subjects is: " + average);
    }

    void display() {
        if (average > 40) {
            System.out.println(rollNo + "." + name + " Average Marks= " + average + "Result = Passed");
        } else {
            System.out.println("RESULT\n RollNo:" + rollNo + ".  NAME:" + name + " \nAverage Marks= " + average + " & Result = Failed");
        }
    }

}

public class StudentGradeSystem {
    public static void main(String[] args) {
        Students s = new Students();
        s.StudentDetails();
        s.AverageMarks();
        s.display();
    }

}
