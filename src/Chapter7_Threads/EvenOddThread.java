package Chapter7_Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

class Print {

    void display() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            } else {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

class EvenThread extends Thread {
    private final Print p;

    EvenThread(Print p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                if (i % 2 == 0) {
                    p.display();
                }
                Thread.sleep(55);
            } catch (InterruptedException ex) {
                Logger.getLogger(EvenThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class OddThread extends Thread {
    private final Print p;

    OddThread(Print p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                p.display();
            }
        }
    }
}

public class EvenOddThread {

    public static void main(String[] args) {
        Print p = new Print();
        EvenThread e = new EvenThread(p);
        OddThread o = new OddThread(p);

        e.setName("Even");
        o.setName("Odd");

        e.start();
        o.start();

        try {
            e.join();
            o.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EvenOddThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}