package Chapter9_UnderstandingCorePackages;


//Converting primitive class to its wrapper class (Boxing in Java )
public class BoxingAndUnboxing {
  public static void main(String[] args) {
        int a=10;
        Integer a1=a;
        double b=10.3;
        Double b1=b;
        char c='A';
        Character c1=c;
        boolean d=true;
        Boolean d1=d;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);

    }
}




//Converting given wrapper class to its primitive class (Unboxing in Java)
//public class BoxingAndUnboxing {
//    public static void main(String[] args) {
//        Integer k=12;
//        Double l=12.43;
//        int k1=  k.intValue();
//        double l1=l.doubleValue();
//        System.out.println(k);
//        System.out.println(l1);
//    }
//}

