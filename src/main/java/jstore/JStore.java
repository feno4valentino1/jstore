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
            DatabaseSupplier.addSupplier(new Supplier("feno v", "fenov@mail.com", "+6288898888878", location1));
            DatabaseSupplier.addSupplier(new Supplier("feno vv", "fenovv@mail.com", "+6287898888888", location1));
        //    DatabaseSupplier.addSupplier(new Supplier("feno vvv", "fenovvv@mail.com", "+6288898888888", location1));
        }
        catch (SupplierAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
        //
        //for(Supplier supplier : DatabaseSupplier.getSupplierDatabase())
        //{
        //    System.out.println(supplier);
        //}

        //try
        //{
        //    DatabaseCustomer.addCustomer(new Customer("andy", "andy@mail.com", "andy123", "Andysmart1", 1990, 2, 15));
        //    DatabaseCustomer.addCustomer(new Customer("boris", "boris@mail.com", "boris", "Passw0rds", 1990, 3, 10));
        //    DatabaseCustomer.addCustomer(new Customer("boris", "boris.boris@mail.com", "boris", "Passw0rdsvds", 1993, 3, 10));
        //}
        //catch (CustomerAlreadyExistsException e)
        //{
        //    System.out.println(e.getExMessage());
        //}

        //for(Customer customer : DatabaseCustomer.getCustomerDatabase())
        //{
        //    System.out.println(customer);
        //}

        try
        {
            DatabaseItem.addItem(new Item("laptop", ItemStatus.New, 10000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("monitor", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("lemari es", ItemStatus.New, 60000, DatabaseSupplier.getSupplier(1), ItemCategory.Furniture));
            DatabaseItem.addItem(new Item("penghapus", ItemStatus.New, 100, DatabaseSupplier.getSupplier(2), ItemCategory.Stationery));
        //    DatabaseItem.addItem(new Item("penghapus", ItemStatus.New, 100, DatabaseSupplier.getSupplier(1), ItemCategory.Stationery));
        }
        catch (ItemAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }

        //for(Item item : DatabaseItem.getItemDatabase())
        //{
        //    System.out.println(item);
        //}



        //ArrayList<Integer> items1 = new ArrayList<Integer>();
        //ArrayList<Integer> items2 = new ArrayList<Integer>();
        //ArrayList<Integer> items3 = new ArrayList<Integer>();
        //items1.add(1);
        //items1.add(2);
        //items2.add(2);
        //items3.add(3);
        //items3.add(2);

        //try
        //{
        //    DatabaseInvoice.addInvoice(new Sell_Paid(items1, DatabaseCustomer.getCustomer(1)));
        //    DatabaseInvoice.addInvoice(new Sell_Installment(items1, 12, DatabaseCustomer.getCustomer(2)));
        //    DatabaseInvoice.addInvoice(new Sell_Unpaid(items3, DatabaseCustomer.getCustomer(2)));
        //    DatabaseInvoice.addInvoice(new Sell_Paid(items1, DatabaseCustomer.getCustomer(1)));
        //}
        //catch (InvoiceAlreadyExistsException e)
        //{
        //    System.out.println(e.getExMessage());
        //}
        //
        //for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        //{
        //    System.out.println(invoice);
        //}

        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));

        //Transaction.cancelTransaction(DatabaseInvoice.getInvoice(3));
        //Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2));

        //for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        //{
        //    System.out.println(invoice);
        //}

    }
}