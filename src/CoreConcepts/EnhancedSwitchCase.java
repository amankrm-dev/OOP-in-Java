package CoreConcepts;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        int day=3;
        String num=switch (day){
            case 1,2,3,4->"Weekday";
            case 6,7->"Weekend";
            default -> "Invalid day";

        };
        System.out.println(num);
    }
}
