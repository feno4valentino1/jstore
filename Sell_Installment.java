package jstore;
import java.util.*;

/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
        isActive = true;
        setInstallmentPrice();
        setTotalPrice();
    }
    /**
     * Method getInstallmentPeriod
     *
     * @param  -
     * @return installmentPeriod
     */
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    /**
     * Method getInstallmentPrice
     *
     * @param  -
     * @return installmentPrice
     */
    public int getInstallmentPrice()
    {
        return installmentPrice;
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
    public void setInstallmentPrice()
    {
        installmentPrice = (getTotalPrice()/installmentPeriod)*102/100;
    }
    public void setTotalPrice()
    {
        setTotalPrice(installmentPrice*installmentPeriod);
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
        string += "\nInstallment price: " + installmentPrice;
        string += "\nInstallment period: " + installmentPeriod;
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nSell success";
        return string;
    }
}
