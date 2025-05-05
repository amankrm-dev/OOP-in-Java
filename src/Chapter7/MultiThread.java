package Chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadNew extends Thread {
    @Override
    public void run() {
        for (int i = 20; i <= 30; i++) {
            try {
                
                System.out.println(Thread.currentThread().getName() + " : "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
    }
}

class ThreadExample extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                
                System.out.println(Thread.currentThread().getName() + " : "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadExample.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
    }
}

public class MultiThread {

    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        ThreadNew t1 = new ThreadNew();
        t.setName("t");
        t1.setName("t1");
        t1.setPriority(1);
        t.setPriority(10);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.start();
        System.out.println(t.getPriority());
//        t.run();          //Here using run won't start thread , it will run one by one not parallel
//        t1.run();
    }
}
