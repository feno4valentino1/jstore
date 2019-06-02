package jstore;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Write a description of class JStore here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
@SpringBootApplication
public class JStore
{   
    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        
    }
    /**
     * Main function
     */
    public static void main(String[] args)
    {
        SpringApplication.run(JStore.class, args);

        Location location1 = new Location("jawa", "depok", "location 1");

        try
        {
            DatabaseSupplier.addSupplier(new Supplier("feno", "feno@mail.com", "+6288898888888", location1));
        }
        catch (SupplierAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

        try
        {
            DatabaseItem.addItem(new Item("laptop", ItemStatus.New, 10000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("meja lipat", ItemStatus.New, 500, DatabaseSupplier.getSupplier(1), ItemCategory.Furniture));
            DatabaseItem.addItem(new Item("monitor", ItemStatus.New, 2000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        }
        catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
    }
}