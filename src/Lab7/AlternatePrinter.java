package Lab7;

class NameCoordinator {
    private boolean firstTurn = true;

    public synchronized void printFirstName(String name) throws InterruptedException {
        while (!firstTurn) {
            wait();
        }
        System.out.print(name + " ");
        firstTurn = false;
        notify();
    }

    public synchronized void printSurname(String name) throws InterruptedException {
        while (firstTurn) {
            wait();
        }
        System.out.println(name);
        firstTurn = true;
        notify();
    }
}

public class AlternatePrinter {
    public static void main(String[] args) {
        NameCoordinator nc = new NameCoordinator();
        String[] firstNames = {"John", "Alice", "Bob", "Emma", "Mike"};
        String[] surnames = {"Smith", "Johnson", "Brown", "Taylor", "Lee"};

        Thread t1 = new Thread(() -> {
            try {
                for (String fname : firstNames) {
                    nc.printFirstName(fname);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (String sname : surnames) {
                    nc.printSurname(sname);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}