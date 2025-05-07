package Chapter13_DatabaseProgrammingUsingJDBC;

import java.sql.*;
public class DatabaseMain2 {

    public static void main(String[] args){
        String url="jdbc:postgresql://localhost:5432/hetauda";
        String username="postgres";
        // TODO: Replace with your actual PostgreSQL password before running
        String password = "YOUR_PASSWORD_HERE";
        String query="INSERT INTO university.college (id, name)	VALUES (4, 'oxford');";
        try (Connection con = DriverManager.getConnection(url,username,password);
                Statement st = con.createStatement();
                ){
            int ab=st.executeUpdate(query);

        }
        catch(SQLException sql){
            System.out.println(sql);
        }
    }

}
