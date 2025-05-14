package Chapter9_UnderstandingCorePackages;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class Dictionarys {
    public static void main(String[] args) {
        Dictionary<String,String> d=new Hashtable<>();
     
                
        d.put("name","aman");
        d.put("id","1");
        d.put("address","hetauda");
        d.put("friend","Ankit");
        d.put("field","AI/ML");
        System.out.println(d);
        System.out.println("The sixe of dictionary is :"+d.size());
        
        //printing all keys using keys()method
        System.out.println("All the keys in dictionary is :");
        
        //for keys
        Enumeration<String>keys=d.keys();
        while(keys.hasMoreElements()){
//            System.out.println(keys.nextElement());
            String k=keys.nextElement();
            System.out.println(k+": "+d.get(k));
        }
        
        //for elements
        System.out.println("THe elements are:");
        Enumeration<String>elements=d.elements();
        while(keys.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
