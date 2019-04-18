package jstore;
import java.util.*;

/**
 * Write a description of class Transaction here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class Transaction
{
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        
    }
    
    public static void orderNewItem(Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderRefurbishedItem(Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemPaid(Item item, Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Sell_Paid(itemID, customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Sell_Unpaid(itemID, customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item, int installmentPeriod, Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Sell_Installment(itemID, installmentPeriod, customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public static boolean finishTransaction(Invoice invoice)
    {
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoiceDB != null)
        {
            invoice.setIsActive(false);
            System.out.println("Invoice isActive status: " + invoice.getIsActive());
            return true;     
        }
        else
        {
            return false;
        }
    }
    
    public static boolean cancelTransaction(Invoice invoice)
    {
        Invoice invoiceDB = DatabaseInvoice.getInvoice(invoice.getId());
        if (invoiceDB != null)
        {
            DatabaseInvoice.removeInvoice(invoiceDB.getId());
            return true;            
        }
        else
        {
            return false;
        }     
    }
}
