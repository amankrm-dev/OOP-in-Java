package Chapter9_UnderstandingCorePackages;
//We use parseXXXX method only for string
public class ParseXXXMethod {
        public static void main(String[] args) {
        String a="12";
        String p="12.32";
        Double.parseDouble(p);
        int a1=Integer.parseInt(a);
        System.out.println(a1);
        String flag="true";
        System.out.println(Boolean.parseBoolean(flag));
    }
}



