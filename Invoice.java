package jstore;
import java.util.*;

/**
 * Write a description of class Invoice here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public abstract class Invoice
{
    private int id;
    private Item item;
    private Calendar date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, int totalItem)
    {
        this.id = id;
        this.item = item;
        this.totalItem = totalItem;
        this.date = Calendar.getInstance();
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
    public Calendar getDate()
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
     * @return -
     */
    public abstract InvoiceStatus getInvoiceStatus();
    /**
     * Method getInvoiceType
     *
     * @param  -
     * @return -
     */
    public abstract InvoiceType getInvoiceType();    
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
    public void setDate(Calendar date)
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
    public abstract void printData();
}