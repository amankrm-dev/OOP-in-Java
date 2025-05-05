package Chapter13;

import java.sql.*;
//public class DatabaseMain {
//
//    public static void main(String[] args){
//        String url="jdbc:postgresql://localhost:5432/hetauda";
//        String username="postgres";
//        String password="codefolly";
//        String query="SELECT id, name FROM university.college;";
//        try (Connection con = DriverManager.getConnection(url,username,password);
//                Statement st = con.createStatement(); 
//                ResultSet rs = st.executeQuery(query)) {
//            System.out.println("ID|Name");
//            while(rs.next()){
//                System.out.print(rs.getInt("id")+" |");
//                System.out.println(rs.getString("name"));
//            }
//        }
//        catch(SQLException sql){
//            System.out.println(sql);
//        }
//    }
//    
//}




//public class DatabaseMain {
//
//    public static void main(String[] args){
//        String url="jdbc:postgresql://localhost:5432/hetauda";
//        String username="postgres";
//        String password="codefolly";
//        String query="INSERT INTO university.college (id, name)	VALUES (4, 'oxford');";
//        try (Connection con = DriverManager.getConnection(url,username,password);
//                Statement st = con.createStatement(); 
//                ){
//            int ab=st.executeUpdate(query);
//            
//        }
//        catch(SQLException sql){
//            System.out.println(sql);
//        }
//    }
//    
//}
