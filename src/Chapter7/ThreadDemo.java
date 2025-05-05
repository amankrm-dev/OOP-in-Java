package Chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadsExample extends Thread {
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

public class ThreadDemo {

    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        ThreadExample t1 = new ThreadExample();
        t.setName("t");
        t1.setName("t1");
        t.start();
        t1.start();
//        t.run();          //Here using run wont start thread , it will run one by one not parallely 
//        t1.run();
    }
}
