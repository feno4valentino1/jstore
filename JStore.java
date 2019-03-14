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
        Location newlocation = new Location("Jawa barat", "Depok", "Kota belimbing");
        Supplier newsupplier = new Supplier(1, "Feno", "feno@gmail.com", "08888", newlocation);
        newlocation.printData();
        newsupplier.printData();
        Transaction newtransaction = new Transaction();
        
        newtransaction.orderNewItem(newsupplier);
        
        newtransaction.orderSecondItem(newsupplier);
        
        newtransaction.orderRefurbishedItem(newsupplier);
        
        newtransaction.sellItemPaid(DatabaseItem.itemDB);
        
        newtransaction.sellItemUnpaid(DatabaseItem.itemDB);
        
        newtransaction.sellItemInstallment(DatabaseItem.itemDB);
        
    }
}