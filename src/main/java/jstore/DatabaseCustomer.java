package jstore;
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
    
    public static boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getUsername().equals(customerDB.getUsername()) ||
                customer.getEmail().equals(customerDB.getEmail()))
            {
                throw new CustomerAlreadyExistsException(customer);
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
    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId() == id)
            {
                CUSTOMER_DATABASE.remove(customerDB);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }

    public static Customer getCustomerLogin(String email, String password)
    {
        for (Customer customerDB : CUSTOMER_DATABASE)
        {
            if (customerDB.getEmail().equals(email) &&
                    customerDB.getPassword().equals(password))
            {
                return customerDB;
            }
        }
        return null;
    }
}
