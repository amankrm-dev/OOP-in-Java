package Lab4;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " is eating dog food.");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " is eating cat food.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 5);
        Cat cat = new Cat("Kitty", 3);

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}