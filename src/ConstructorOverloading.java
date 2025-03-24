class Box{
    int height,length,width;
    Box(){
        length=width=height=1;

    }
    Box(int l,int w,int h){   //Parameterized Constructor
        length=l;
        width=w;
        height=h;
    }
    int volume(){
        return length*width*height;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1=new Box(3,3,3);
        Box b2=new Box();
        System.out.println("Volume of Box is :"+b1.volume());
        System.out.println("Volume of Default box is :"+b2.volume());
    }
}
