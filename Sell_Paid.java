package jstore;
import java.util.*;

/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer = customer;
        isActive = false;
    }
    /**
     * Method getInvoiceStatus
     *
     * @param  -
     * @return INVOICE_STATUS
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    /**
     * Method getInvoiceType
     *
     * @param  -
     * @return INVOICE_TYPE
     */
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    public String toString()
    {
        String string="==========INVOICE==========";
        string += "\nID: "+getId();
        string += "\nBuy date: " + getDate();
        for (Integer i : getItem())
        {
            Item item = DatabaseItem.getItemFromID(i.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier name: " + item.getSupplier().getName();
        }
        string += "\nTotal price: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nSell success";
        return string;
    }
}
