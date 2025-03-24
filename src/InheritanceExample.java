class Animal{
    void make_sound(){
        System.out.println("Some sound .....");
    }
}
class Dog extends Animal{
    void make_sound(){
        super.make_sound();
        System.out.println("Bark...");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.make_sound();
    }
}



/*
Understanding the Code

1. Parent Class: Animal
java
class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}
This is a base class (superclass) named Animal.
It has a method makeSound(), which prints "Some sound...".
This method is meant to be overridden by subclasses.
2. Child Class: Dog (Extending Animal)
java
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}
The Dog class inherits from Animal using extends Animal.
It overrides the makeSound() method to print "Bark!" instead of "Some sound...".
3. main() Method (Program Execution)
java
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}

A Dog object d is created.
The makeSound() method of Dog is called.
Since Dog has overridden the method, it prints "Bark!" instead of "Some sound...".
Output:
Bark!

Why is Inheritance Important?
Code Reusability → The Dog class gets all properties of Animal without rewriting them.
Method Overriding → Allows child classes to provide specific implementations.
Organized Code Structure → Helps in creating a hierarchy of classes (e.g., Animal → Dog).
Extensibility → New types of animals (e.g., Cat, Cow) can be added easily.
This is an example of single inheritance (one class inheriting from another). 🚀









then how to call animal method ??


If you want to call the makeSound() method of the parent class (Animal) from the child class (Dog), you can use the super keyword. Here’s how you do it:

Modified Code: Calling Parent Class Method
java
class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    void makeSound() {
        super.makeSound(); // Calls Animal's makeSound() method
        System.out.println("Bark!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
Explanation of Changes:
Using super.makeSound();
super is a keyword that refers to the parent class (Animal).
super.makeSound(); calls the makeSound() method of Animal before executing the Dog class’s version.
Output:
Some sound...
Bark!
Alternative: Calling Parent Method from main()
If you want to call the parent class method separately, you can do this:

java
public class InheritanceExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound(); // Calls Animal's method

        Dog d = new Dog();
        d.makeSound(); // Calls Dog's method (which also calls Animal's method)
    }
}
Output:

Some sound...
Some sound...
Bark!
This approach explicitly calls the Animal class method using an Animal object.














 */
