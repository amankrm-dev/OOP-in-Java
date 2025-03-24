package Chapter4;
class Fruit{
    String name,taste;
    double size;
    Fruit(String name,String taste,double size){
        this.name=name;
        this.taste=taste;
        this.size=size;
    }
    void eat(){
        System.out.println("The name of the fruit is "+name+" & the taste is like :"+taste+" Also it is as big as "+size);

    }
}
class Apple extends Fruit{
    Apple(String name,String taste,double size){
        super(name, taste, size);
    }
    void eat(){
        super.eat();
        System.out.println("The taste is like :"+taste);
    }
}
public class FruitMain {
    public static void main(String[] args) {
        Apple a= new Apple("Apple","Sweet",22);
        Apple b= new Apple("Mango","Sweet",12);
        a.eat();
        b.eat();
    }
}
