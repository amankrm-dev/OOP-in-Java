package Chapter9_UnderstandingCorePackages;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.add("ram");
        s.push("hari");
        System.out.println(s);
        s.push("ankiy");
        System.out.println(s);
        s.pop();
        s.push("ankiy");
        System.out.println(s);
        s.push("thomas");
        s.push("ricky");
        s.push("HarryEdison");
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search("ankiy"));
    }
}
