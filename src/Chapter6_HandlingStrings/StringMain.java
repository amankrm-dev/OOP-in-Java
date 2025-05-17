package Chapter6_HandlingStrings;


public class StringMain {

    public static void main(String[] args) {
//        String word = "apple is red";
//        System.out.println(word.charAt(6));
//        char[] buff=new char[10];
//        word.getChars(9, 12, buff, 0);
//        System.out.println(buff);
//        System.out.println(word.toCharArray());
//       String a="Apple";
//       String b="apple";
        String a="the house is red";
        String b="the car is white";
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));
//        System.out.println(a.startsWith("a"));
        System.out.println(a.startsWith("pp",1));
        System.out.println(a.compareTo(b));
        System.out.println(a.regionMatches(false, 11, b, 9,2));
        System.out.println(a.substring(3,2));
    
    }

}

