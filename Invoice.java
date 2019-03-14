package jstore;


/**
 * Write a description of class Invoice here.
 *
 * @author Feno Valentino
 * @version 28 Feb 2019
 */
public class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
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
     * Method printData prints out "totalPrice".
     *
     * @param  -
     * @return -
     */
    public void printData()
    {
        System.out.println(totalPrice);
    }
}