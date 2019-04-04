package jstore;

/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    private Invoice[] listInvoice;
    public static Invoice invoice;
    
    
    public DatabaseInvoice()
    {
        
    }
    public static boolean addInvoice(Invoice invoice)
    {
        return true;
    }
    public static boolean removeInvoice(Invoice invoice)
    {
        return true;
    }
    public Invoice getInvoice()
    {
        return invoice;
    }
    public Invoice[] getListInvoice(){
        // return dari accessor 
        return listInvoice;
    }
}