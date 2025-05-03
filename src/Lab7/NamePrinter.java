package Lab7;

class FirstNameThread extends Thread {
    public void run() {
        String[] firstNames = {"John", "Alice", "Bob", "Emma", "Mike", "Nina", "Tom", "Sara", "Luke", "Lily"};
        for (String name : firstNames) {
            System.out.println("First Name: " + name);
        }
    }
}

class SurnameThread extends Thread {
    public void run() {
        String[] surnames = {"Smith", "Johnson", "Brown", "Taylor", "Lee", "Walker", "Hall", "Allen", "Young", "King"};
        for (String surname : surnames) {
            System.out.println("Surname: " + surname);
        }
    }
}

public class NamePrinter {
    public static void main(String[] args) {
        FirstNameThread t1 = new FirstNameThread();
        SurnameThread t2 = new SurnameThread();

        t1.start();
        t2.start();
    }
}