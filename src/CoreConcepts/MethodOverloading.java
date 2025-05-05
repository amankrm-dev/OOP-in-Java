package CoreConcepts;
public class MethodOverloading {
    void display(int n){
        System.out.println("Integer="+n);
    }
    void display(double n){
        System.out.println("Doble="+n);
    }
    public static void main(String[] args) {
        MethodOverloading obj= new MethodOverloading();
        obj.display(66);   //calls integer method
        obj.display(12.5);  // calls double method
    }
}

/*
### **Method Overloading in Java**

**Definition:**
Method overloading is a feature in Java that allows multiple methods to have the same name but with **different parameters** (varying in number, type, or both). The compiler determines which method to execute based on the arguments passed.

**Key Points:**
- Overloaded methods **must have different parameter lists**, but their return types can be the same or different.
- Java resolves method overloading at **compile-time**, so it is also called **static polymorphism**.
- It improves **code readability and reusability**, allowing multiple versions of a method to exist for different use cases.

**Example:**
```java
class OverloadExample {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(10);      // Calls integer method
        obj.display(10.5);    // Calls double method
    }
}
```
### **Explanation:**
In this example, both methods have the same name `display()`, but one accepts an **integer** and the other a **double**. The compiler determines which method to call based on the type of argument passed. This avoids the need for multiple method names, making the code cleaner and more organized.

Method overloading is widely used in Java, such as in **mathematical operations, string manipulation, and constructors**.
 */