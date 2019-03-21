package jstore;


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
    private String dueDate;
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalItem, int totalPrice, String dueDate)
    {
        super(id, item, date, totalItem, totalPrice);
        this.dueDate = dueDate;
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
    public String getDueDate()
    {
        return dueDate;
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
        System.out.println("Due date: " + getDueDate());
        System.out.println("Total price: " + totalPrice);
        System.out.println("\n");
    }
}
