package Chapter4_InheritanceAndPackaging;

class Student {

    int total_marks;
    int obtained_marks;

    Student(int total_marks, int obtained_marks) {
        this.total_marks = total_marks;
        this.obtained_marks = obtained_marks;
    }

    void percentage() {
        double per = (obtained_marks / total_marks) * 100;
        System.out.println("THe Obtained Percentage is :" + per);
    }
}

class SpecialStudent extends Student {

    int total_marks;

    SpecialStudent(int total_marks, int obtained_marks) {
        super(total_marks, obtained_marks);
        this.total_marks = 200;  //Always at below of parent class variables

    }

    void percentage() {
        double per = (obtained_marks / total_marks) * 100 + 5;
        System.out.println("THe Obtained Percentage(SpecialStudent) is :" + per);
        super.percentage();
        System.out.println(super.total_marks);
    }
}

public class Inheritance{

    public static void main(String[] args) {

        SpecialStudent s1 = new SpecialStudent(500, 400);
        s1.percentage();
        System.out.println(s1.total_marks);

    }
}