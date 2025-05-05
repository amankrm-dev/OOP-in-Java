package Chapter4;

class School {

    String school_name, school_address;
    int school_code;

    School(String school_name, String school_address, int school_code) {
        this.school_name = school_name;
        this.school_address = school_address;
        this.school_code = school_code;
    }

    void display() {
        System.out.println("The School name is " + this.school_name + " & It is located in " + this.school_address + " With School code:" + this.school_code);
    }
}

class Students {

    int student_id, student_age;
    double student_percentage;
    String student_name;

    Students(String student_name, int student_id, int student_age, double student_percentage) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_age = student_age;
        this.student_percentage = student_percentage;
    }

    void display() {
        System.out.println(this.student_name + " has student id:" + student_id + " and he is: " + student_age + " years old and he scored :" + student_percentage + " percentage");
    }

    void search(int SearchId) {
        if (this.student_id == SearchId) {
            System.out.println("Search Found. The name is: " + this.student_name);
        } else {
            System.out.println("Search not Found");
        }
    }
}

public class SchoolMain {

    public static void main(String[] args) {
        Students s = new Students("Riyaz", 2, 30, 90);
        Students srch = new Students("Riyaz", 2, 30, 90);

        s.display();
        srch.search(2);
    }
}