package jstore;


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
        Location location1 = new Location("Depok", "Jawa Barat", "Rumah saya");
        Supplier supplier1 = new Supplier(1, "PT Feno", "feno@gmail.com", "0888888888", location1);
        location1.printData();
        supplier1.printData();
        
        Item item1 = new Item(1, "Monitor", 10, ItemStatus.New, 100000, supplier1, ItemCategory.Electronics);
        DatabaseItem.addItem(item1);
        
        Transaction.orderNewItem(item1);
        Transaction.sellItemPaid(item1);
        Transaction.sellItemUnpaid(item1);
        Transaction.sellItemInstallment(item1);
        
    }
}