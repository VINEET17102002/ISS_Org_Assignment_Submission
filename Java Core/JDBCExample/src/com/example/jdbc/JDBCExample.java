package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbURL = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Vin@@123";

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            conn = DriverManager.getConnection(dbURL, username, password);

            // Step 3: Execute a query
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");

            // Step 4: Process the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
