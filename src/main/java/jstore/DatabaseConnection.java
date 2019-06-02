package jstore;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection
{
    protected static Connection connection()
    {
        Connection connection = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jstore", "postgres", "admin2");
        } catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return connection;
    }
}
