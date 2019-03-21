package jstore;


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
    
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item, String date, int totalItem, int totalPrice)
    {
        super(id, item, date, totalItem, totalPrice);
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
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Invoice type: " + getInvoiceType());
        System.out.println("Total price: " + totalPrice);
        System.out.println("\n");
    }
}
