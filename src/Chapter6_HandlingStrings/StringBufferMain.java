package Chapter6_HandlingStrings;
public class StringBufferMain {
    public static void main(String[] args) {
//        StringBuffer s= new StringBuffer(5);
//        s.append("hetauda");  // Formula:old_capacity*10 +2 
//        System.out.println(s.capacity());


          StringBuffer[] s={new StringBuffer("Hello"),new StringBuffer("World"),new StringBuffer("Boss")};
          
          System.out.println("Enter 5 different  strings :");
          for(StringBuffer i:s){
              System.out.println(i.reverse());
          }
                  
    }
}
