package Chapter9_UnderstandingCorePackages;

import java.util.Vector;

public class UsingVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>(5);//By default 10 internal capacity
        v.add(12);
        v.add(1);
        v.add(14);
        v.add(1,100);

        System.out.println(v);
        for(Integer a:v){
            System.out.println(a);
        }
        v.remove(1);
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.get(2));
    }
}
