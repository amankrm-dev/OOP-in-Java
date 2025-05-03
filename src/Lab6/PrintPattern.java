package Lab6;

public class PrintPattern {
    public static void main(String[] args) {
        String str = "HETAUDA";

        while (str.length() > 0) {
            System.out.println(str);
            if (str.length() > 2) {
                str = str.substring(1, str.length() - 1);
            } else {
                str = str.substring(1);
            }
        }
    }
}
