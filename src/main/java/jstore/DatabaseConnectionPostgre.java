package jstore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DatabaseConnectionPostgre extends DatabaseConnection
{
    public static Customer insertCustomer(String name, String email, String username, String password, int year, int month, int dayofmonth)
    {
        Connection connection = connection();
        PreparedStatement statement;
        Customer customer = null;
        try
        {
            String sql = "INSERT INTO customer (name, email, username, password, year, month, dayofmonth) values (?,?,?,?,?,?,?) RETURNING id;";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, username);
            statement.setString(4, password);
            statement.setInt(5, year);
            statement.setInt(6, month);
            statement.setInt(7, dayofmonth);
            ResultSet rs = statement.executeQuery();
            int id = 1;
            while (rs.next())
            {
                id = rs.getInt(1);
            }
            customer = new Customer(id, name, email, username, password, year, month, dayofmonth);
            customer.setId(id);
            statement.close();
            connection.close();
            return customer;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return customer;
    }

    public int getLastCustomerId()
    {
        Connection connection = connection();
        PreparedStatement statement;
        int id = 0;
        try
        {
            String sql = "SELECT id from customer;";
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
                id = rs.getInt(1);
            }
            statement.close();
            connection.close();
            return id;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return id;
    }

    public static Customer getCustomer(String email_cust, String password_cust)
    {
        Connection connection = connection();
        PreparedStatement statement;
        int id = 0;
        String name = null;
        String email = null;
        String username = null;
        String password = null;
        int year = 0;
        int month = 0;
        int dayofmonth = 0;
        Customer customer = null;
        try
        {
            String sql = "SELECT * from customer where email=? and password=?;";
            statement = connection.prepareStatement(sql);
            statement.setString(1, email_cust);
            statement.setString(2, password_cust);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                username = rs.getString("username");
                password = rs.getString("password");
                year = rs.getInt("year");
                month = rs.getInt("month");
                dayofmonth = rs.getInt("dayofmonth");
            }
            statement.close();
            connection.close();
            customer = new Customer(id, name, email, username, password, year, month, dayofmonth);
            return customer;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return customer;
    }

    public void removeCustomer(int id)
    {
        Connection connection = connection();
        PreparedStatement statement;
        try {
            String sql = "DELETE FROM customer where id=?;";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement = connection.prepareStatement(sql);
            statement.execute();
            statement.close();
            connection.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
