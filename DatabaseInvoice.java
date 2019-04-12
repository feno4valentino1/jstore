package jstore;
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
    
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID=invoice.getId();
        return true;
    }
    public static Invoice getInvoice(int id)
    {
        Invoice returnValue = null;
        for (Invoice invoiceDB : INVOICE_DATABASE)
        {
            if (invoiceDB.getId() == id)
            {
                returnValue = invoiceDB;
            }
        }
        return returnValue;
    }
    public static Invoice getActiveOrder(Customer customer)
    {
        Invoice returnValue = null;
        for (Invoice invoiceDB : INVOICE_DATABASE)
    {
            if ((invoiceDB.getInvoiceStatus() == InvoiceStatus.Unpaid ||
            invoiceDB.getInvoiceStatus() == InvoiceStatus.Installment) &&
            invoiceDB.getIsActive() == true)
            {
                returnValue = invoiceDB;
            }
        }
        return returnValue;
    }
    public static boolean removeInvoice(int id)
    {
        boolean returnValue = false;
        for(Invoice invoiceDB : INVOICE_DATABASE)
        {
            if(invoiceDB.getId() == id)
            {
                if (invoiceDB.getIsActive() == true)
                {
                    invoiceDB.setIsActive(false);
                }
                INVOICE_DATABASE.remove(id);
                returnValue = true;
            }
        }
        return returnValue;
    }
}