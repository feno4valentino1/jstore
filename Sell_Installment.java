package jstore;


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
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod, int installmentPrice)
    {
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod = installmentPeriod;
        this.installmentPrice = installmentPrice;
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
    public void setInstallmentPrice()
    {
        installmentPrice = (totalPrice/installmentPeriod)*102/100;
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
        System.out.println("Total price: " + totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Installment price: " + getInstallmentPrice());
        System.out.println("\n");
    }
}
