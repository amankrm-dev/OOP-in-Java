 public class VarArgsExample {
    void display(int... numbers) {  // 'numbers' is a varargs parameter
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgsExample obj = new VarArgsExample();
        obj.display();          // No arguments
        obj.display(10);        // One argument
        obj.display(10, 20, 30); // Multiple arguments
    }
}




/*
### **Varargs (Variable Arguments) in Java**

**Varargs** (short for **variable arguments**) is a feature in Java that allows a method to accept **a variable number of arguments** of the same type.

### **Syntax:**
```java
returnType methodName(dataType... variableName) {
    // method body
}
```
- `dataType... variableName` means the method can take **zero or more** arguments of that data type.
- Inside the method, `variableName` behaves like an **array** (`dataType[]`).

---

### **Example 1: Using Varargs in a Method**
```java
class Test {
    void display(int... numbers) {  // 'numbers' is a varargs parameter
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();          // No arguments
        obj.display(10);        // One argument
        obj.display(10, 20, 30); // Multiple arguments
    }
}
```
### **Output:**
```
Number of arguments: 0

Number of arguments: 1
10

Number of arguments: 3
10 20 30
```

---

### **Key Points About Varargs:**
1. **Acts like an array:** Inside the method, the varargs parameter behaves like an array (`int[]` in this case).
2. **Must be the last parameter:** If a method has multiple parameters, varargs **must be the last one**.
   ```java
   void show(String msg, int... numbers) { } // ✅ Valid
   void show(int... numbers, String msg) { } // ❌ Invalid
   ```
3. **Cannot have multiple varargs in one method:**
   ```java
   void test(int... a, int... b) { } // ❌ Not allowed
   ```
4. **Varargs can be empty:** If no arguments are passed, the varargs array will have zero length.

Would you like more examples or explanations? 😊
 */
