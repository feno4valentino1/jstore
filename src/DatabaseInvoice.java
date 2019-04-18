import java.util.*;

/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public DatabaseInvoice()
    {
        
    }
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
            if(invoice.getItem().equals(invoiceDB.getItem()) &&
                    invoice.getCustomer().equals(invoiceDB.getCustomer()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
    public static Invoice getInvoice(int id)
    {
        for (Invoice invoiceDB : INVOICE_DATABASE)
        {
            if (invoiceDB.getId() == id)
            {
                return invoiceDB;
            }
        }
        return null;
    }
    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> Invoice_list = new ArrayList<Invoice>();
        for (Invoice invoiceDB : INVOICE_DATABASE)
        {
            if (invoiceDB.getIsActive() == true &&
                            customer.equals(invoiceDB.getCustomer()))
            {
                Invoice_list.add(invoiceDB);
            }
        }
        if (Invoice_list == null)
        {
            throw new CustomerDoesntHaveActiveException(customer);
        }
        return Invoice_list;
    }
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
            if(invoiceDB.getId() == id)
            {
                if (invoiceDB.getIsActive() == true)
                {
                    invoiceDB.setIsActive(false);
                }
                INVOICE_DATABASE.remove(invoiceDB);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}