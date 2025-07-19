package LastDayRevise;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

class NameCoordinator{
    private boolean firstTurn=true;
    public synchronized void printFirstName(String name) throws InterruptedException{
        while(!firstTurn){
            wait();
        }
        System.out.print(name+" ");
        firstTurn=false;
        notify();
    }
    public synchronized void printSurName(String surName)  throws InterruptedException{
        while(firstTurn){
            wait();
        }
        System.out.print(surName+" ");
        firstTurn=true;
        notify();
    }
}

public class AlternatePrinter {
    public static void main(String[] args) {
        NameCoordinator nc=new NameCoordinator();
        String[] firstNames={"Aman","Ankit","Suroj"};
        String[] surNames={"Mandal","Chimariya","Rana"};
        Thread t1=new Thread(()->{
            try {
                for (String fname : firstNames) {
                    nc.printFirstName(fname);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            });
        Thread t2=new Thread(()->{
            try {
                for (String sname : surNames) {
                    nc.printSurName(sname);
                }
            }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
        });
        t1.start();
        t2.start();
        }
    }

