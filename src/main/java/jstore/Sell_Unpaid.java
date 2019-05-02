package jstore;
import java.util.*;
import java.text.*;

/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate = Calendar.getInstance();
    private Customer customer;
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer = customer;
        this.dueDate.add(Calendar.DATE, +1);
        setIsActive(true);
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
    /**
     * Method getDueDate
     *
     * @param  -
     * @return dueDate
     */
    public Calendar getDueDate()
    {
        return dueDate;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String string="==========INVOICE SELL UNPAID==========";
        string += "\nID: "+getId();
        string += "\nBuy date: " + sdf.format(getDate().getTime());
        for (Integer i : getItem())
        {
            Item item = DatabaseItem.getItemFromID(i.intValue());
            string += "\nItem: " + item.getName();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier name: " + item.getSupplier().getName();
        }
        string += "\nTotal price: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nDue date: " + sdf.format(getDueDate().getTime());
        string += "\nIf payment is not received by due date, this transaction will be cancelled.";
        return string;
    }
}
