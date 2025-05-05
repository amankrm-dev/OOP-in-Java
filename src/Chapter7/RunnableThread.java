package Chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExamples implements Runnable {
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

public class RunnableThread {

    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        Thread a=new Thread(t);
        ThreadExample t1 = new ThreadExample();
        Thread b=new Thread(t1);
        a.setName("t");
        b.setName("t1");
        a.start();
        b.start();
//        t.run();          //Here using run wont start thread , it will run one by one not parallely 
//        t1.run();
    }
}
