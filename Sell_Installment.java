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
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer)
    {
        super(id, item, totalItem);
        this.installmentPeriod = installmentPeriod;
        this.customer = customer;
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
        totalPrice = installmentPrice*installmentPeriod;
    }
    /**
     * Method printData prints out invoice info.
     *
     * @param  -
     * @return -
     */
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID: " + getId());
        System.out.println("Date: " + getDate());
        System.out.println("Item: " + getItem().getName());
        System.out.println("Invoice status: " + getInvoiceStatus());
        System.out.println("Invoice type: " + getInvoiceType());
        System.out.println("Total price: " + getTotalPrice());
        System.out.println("Number of installments: " + getInstallmentPeriod());
        System.out.println("Installment price: " + getInstallmentPrice());
    }
}
