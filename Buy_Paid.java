package jstore;
import java.util.*;

/**
 * Write a description of class Buy_Paid here.
 *
 * @author Feno Valentino
 * @version 21 Mar 2019
 */
public class Buy_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
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
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    public String toString()
    {
        String string="==========INVOICE==========";
        string += "\nID: " + getId();
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
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nBuy success";
        return string;
    }
    
}
