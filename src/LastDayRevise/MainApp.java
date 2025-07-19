package LastDayRevise;
import LastDayRevise.Calculator;
public class MainApp {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int sum =calc.add(5,2);
        int square=calc.square(5);
        System.out.println("Sum :"+sum+"and square:"+square);
    }
}
