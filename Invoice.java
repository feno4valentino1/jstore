package jstore;


/**
 * Write a description of class Invoice here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice, InvoiceStatus status)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
        this.status = status;
    }
    /**
     * Method getId
     *
     * @param  -
     * @return id
     */
    public int getId()
    {
        return id;
    }
    /**
     * Method getItem
     *
     * @param  -
     * @return item
     */
    public Item getItem()
    {
        return item;
    }
    /**
     * Method getDate
     *
     * @param  -
     * @return date
     */
    public String getDate()
    {
        return date;
    }
    /**
     * Method getTotalPrice
     *
     * @param  -
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    /**
     * Method getTotalItem
     *
     * @param  -
     * @return totalItem
     */
    public int getTotalItem()
    {
        return totalItem;
    }
    /**
     * Method getInvoiceStatus
     *
     * @param  -
     * @return status
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    /**
     * Method setId
     *
     * @param  id
     * @return -
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * Method setItem
     *
     * @param  item
     * @return -
     */
    public void setItem(Item item)
    {
        this.item = item;
    }
    /**
     * Method setDate
     *
     * @param  date
     * @return -
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    /**
     * Method setTotalPrice
     *
     * @param  totalPrice
     * @return -
     */
    public void setTotalPrice (int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    /**
     * Method setTotalItem
     *
     * @param  totalItem
     * @return -
     */
    public void setTotalItem (int totalItem)
    {
        this.totalItem = totalItem;
    }
    /**
     * Method setInvoiceStatus
     *
     * @param  status
     * @return -
     */
    public void setInvoiceStatus (InvoiceStatus status)
    {
        this.status = status;
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
        System.out.println("ID: " + id);
        System.out.println("Date: " + date);
        System.out.println("Item: " + item.getName());
        System.out.println("Total price: " + totalPrice);
        System.out.println("Status: " + status);
        System.out.println("\n");
    }
}