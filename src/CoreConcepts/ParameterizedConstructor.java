package CoreConcepts;
class Student{
    String name;
    int age;

    Student(String n,int a){
         name=n;
        age=a;
    }
    void display(){
        System.out.println("Name: "+name+" and Age: "+age);
    }
 }
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s=new Student("Aman Kr",21);
        s.display();
    }
}
