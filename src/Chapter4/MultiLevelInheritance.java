package Chapter4;

class MathOperation{
    int num1,num2;
    MathOperation(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void multiply(){
        System.out.println("Multiplication ="+this.num1*this.num2);

    }
}

class AdvanceMath extends MathOperation{
    int num3;
    AdvanceMath(int num1,int num2,int num3){
        super(num1,num2);
        this.num3=num3;
    }
    void SquareRoot(){
        System.out.println("Square Root="+Math.sqrt(this.num3));
    }
}

class SuperAdvanceMath extends AdvanceMath{
    int exp,pow;
    SuperAdvanceMath(int num1,int num2,int num3,int exp,int pow){
        super(num1,num2,num3);
    }
    void power(){
        System.out.println("Power="+Math.pow(exp, pow));
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {;
        SuperAdvanceMath m1=new SuperAdvanceMath(4,9,5,3,2);
        m1.multiply();
        m1.SquareRoot();
        m1.power();
    }
}
