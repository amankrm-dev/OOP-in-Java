package Chapter5_HandlingErrorsAndExceptions;

public class StringMain {
    public static void main(String[] args) {
        String a="apple";
        String b="apple";
        String c=new String("apple");
        String word=new String("Apple");
        String d="cat";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        

    }
}
