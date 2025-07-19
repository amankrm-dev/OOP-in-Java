package LastDayRevise;
class Animal{
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println(name+"is eating");
    }
    public  void sleep(){
        System.out.println(name+"is sleeping");
    }
}
class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println(name+"is eating dog food");
    }
    public void sleep(){
        System.out.println(name+" is sleeping ");
    }

}
class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println(name+"is eating cat food");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping ");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog("tommy",5);
        Cat c=new Cat("kitty",3);
        d.eat();
        d.sleep();
        c.eat();
        c.sleep();
    }
}
