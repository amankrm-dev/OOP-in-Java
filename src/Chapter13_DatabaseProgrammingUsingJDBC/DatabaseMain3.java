package Chapter13_DatabaseProgrammingUsingJDBC;

import java.sql.*;
import java.util.Scanner;
public class DatabaseMain3 {
     public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/hetauda";
        String username = "postgres";
        // TODO: Replace with your actual PostgreSQL password before running
        String password = "YOUR_PASSWORD_HERE";
       String insertquery ="INSERT INTO university.college(id, name) VALUES (?, ?);";
         String query="SELECT id, name FROM university.college;";
        try(Connection con = DriverManager.getConnection(url,username,password);
               PreparedStatement insertStmt = con.prepareStatement(insertquery);
                Scanner scanner = new Scanner(System.in);)
        {
            for(int i=20;i<23    ;i++){
                System.out.println("Enter name:");
                String name = scanner.nextLine();

                insertStmt.setInt(1,i);
                insertStmt.setString(2,name);
                insertStmt.executeUpdate();

            }
            System.out.println("5 recorded are insert successfully.");

        }
        catch(SQLException ex){
            System.out.println("Database Error: " +ex);
        }
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                ) {
             System.out.println("Id|Name");


             //print the name which is start with 'a'.

        while(rs.next()){
            String temp= rs.getString("name");
            //rs.getString("name");

            if(temp.startsWith("a")){
            System.out.print(rs.getInt("id")+ "|");
            System.out.println(rs.getString("name"));


        }}

             } catch (SQLException sql) {
            System.out.println(sql);
        }

    }
}
