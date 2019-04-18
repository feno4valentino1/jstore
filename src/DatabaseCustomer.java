
import java.util.*;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE =  new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;
      
    public DatabaseCustomer()
    {
        
    }
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    
    public static boolean addCustomer(Customer customer)
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName().equals(customerDB.getName()) &&
                customer.getEmail().equals(customerDB.getEmail()))
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
        
    }
    public static Customer getCustomer(int id)
    {
        Customer returnValue = null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId() == id)
            {
                returnValue = customerDB;
            }
        }
        return returnValue;
    }
    public static boolean removeCustomer(int id)
    {
        boolean returnValue = false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId() == id)
            {
                CUSTOMER_DATABASE.remove(id);
                returnValue = true;
            }
        }
        return returnValue;
    }
}
