package LastDayRevise;

import javax.management.remote.JMXServiceURL;

class FirstNameThread  extends Thread{
    public void run(){
        String[] firstNames={"Aman","Ankit","Suroj"};
        for(String name:firstNames){
            System.out.println("FirstNames: "+name);
        }
    }
}
class SutNameThread  extends Thread{
    public void run(){
        String[] surNames={"Mandal","Chimariya","Rana"};
        for(String surname:surNames){
            System.out.println("SurNames: "+surname);
        }
    }
}
public class NamePrinter {
    public static void main(String[] args) {
        FirstNameThread t1=new FirstNameThread();
        SutNameThread t2=new SutNameThread();
        t1.start();
        t2.start();
    }
}
