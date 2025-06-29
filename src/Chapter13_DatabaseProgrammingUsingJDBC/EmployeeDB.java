package Chapter13_DatabaseProgrammingUsingJDBC;

import java.sql.*;

public class EmployeeDB {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/my_company_dbms";
        String user = "postgres";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // Create schema and table
            stmt.executeUpdate("CREATE SCHEMA IF NOT EXISTS my_company");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS my_company.employee ("
                    + "id INT PRIMARY KEY,"
                    + "name VARCHAR(50),"
                    + "address VARCHAR(100),"
                    + "salary INT)");

            // Insert records
            PreparedStatement ps = con.prepareStatement("INSERT INTO my_company.employee VALUES (?, ?, ?, ?)");
            ps.setInt(1, 1); ps.setString(2, "Alice"); ps.setString(3, "Kathmandu"); ps.setInt(4, 25000); ps.executeUpdate();
            ps.setInt(1, 2); ps.setString(2, "Bob"); ps.setString(3, "Lalitpur"); ps.setInt(4, 18000); ps.executeUpdate();
            ps.setInt(1, 3); ps.setString(2, "Charlie"); ps.setString(3, "Bhaktapur"); ps.setInt(4, 22000); ps.executeUpdate();
            ps.setInt(1, 4); ps.setString(2, "Diana"); ps.setString(3, "Pokhara"); ps.setInt(4, 27000); ps.executeUpdate();
            ps.setInt(1, 5); ps.setString(2, "Eve"); ps.setString(3, "Butwal"); ps.setInt(4, 19000); ps.executeUpdate();

            // Display all records
            ResultSet rs = stmt.executeQuery("SELECT * FROM my_company.employee");
            System.out.println("All Employee Records:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("address") + ", " + rs.getInt("salary"));
            }

            // Update name where id = 2
            stmt.executeUpdate("UPDATE my_company.employee SET name='james' WHERE id=2");

            // Display employees with salary > 20000
            rs = stmt.executeQuery("SELECT * FROM my_company.employee WHERE salary > 20000");
            System.out.println("\nEmployees with salary > 20000:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("address") + ", " + rs.getInt("salary"));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}