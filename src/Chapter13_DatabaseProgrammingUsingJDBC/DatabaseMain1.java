package Chapter13_DatabaseProgrammingUsingJDBC;

import java.sql.*;
public class DatabaseMain1 {

    public static void main(String[] args){
        String url="jdbc:postgresql://localhost:5432/hetauda";
        String username="postgres";
        // TODO: Replace with your actual PostgreSQL password before running
        String password = "YOUR_PASSWORD_HERE";
        String query="SELECT id, name FROM university.college;";
        try (Connection con = DriverManager.getConnection(url,username,password);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query)) {
            System.out.println("ID|Name");
            while(rs.next()){
                System.out.print(rs.getInt("id")+" |");
                System.out.println(rs.getString("name"));
            }
        }
        catch(SQLException sql){
            System.out.println(sql);
        }
    }

}



