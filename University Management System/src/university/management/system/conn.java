package university.management.system;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ums",
                    "root",
                    "hellosai");

            s = c.createStatement();

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}