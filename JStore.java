package jstore;
import java.util.*;

/**
 * Write a description of class JStore here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
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
        Location location1 = new Location("jawa", "depok", "location 1");
        
        DatabaseSupplier.addSupplier(new Supplier("feno", "feno@mail.com", "+6288898888888", location1));
        DatabaseSupplier.addSupplier(new Supplier("feno v", "fenov@mail.com", "+6288898888888", location1));
        DatabaseSupplier.addSupplier(new Supplier("feno vv", "fenovv@mail.com", "+6288898888888", location1));
        
        for(Supplier supplier : DatabaseSupplier.getSupplierDatabase())
        {
            System.out.println(supplier);
        }
        
        DatabaseCustomer.addCustomer(new Customer("andy", "andy@mail.com", "andy123", "Andysmart1", 1990, 2, 15));
        DatabaseCustomer.addCustomer(new Customer("boris", "boris@mail.com", "boris", "Passw0rds", 1990, 3, 10));
        
        for(Customer customer : DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(customer);
        }
        
        DatabaseItem.addItem(new Item("laptop", 10, ItemStatus.New, 10000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        DatabaseItem.addItem(new Item("monitor", 5, ItemStatus.New, 5000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
        DatabaseItem.addItem(new Item("lemari es", 7, ItemStatus.New, 60000, DatabaseSupplier.getSupplier(1), ItemCategory.Furniture));
        DatabaseItem.addItem(new Item("penghapus", 50, ItemStatus.New, 100, DatabaseSupplier.getSupplier(2), ItemCategory.Stationery));
        
        for(Item item : DatabaseItem.getItemDatabase())
        {
            System.out.println(item);
        }
        
        ArrayList<Integer> items1 = new ArrayList<Integer>();
        ArrayList<Integer> items2 = new ArrayList<Integer>();
        ArrayList<Integer> items3 = new ArrayList<Integer>();
        items1.add(1);
        items1.add(2);
        items2.add(2);
        items3.add(3);
        items3.add(2);
        
        DatabaseInvoice.addInvoice(new Sell_Paid(items1, DatabaseCustomer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Installment(items1, 12, DatabaseCustomer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Unpaid(items3, DatabaseCustomer.getCustomer(2)));
        
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice);
        }
        
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
        
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2));
        
    }
}