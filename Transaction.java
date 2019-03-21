package jstore;


/**
 * Write a description of class Transaction here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class Transaction
{
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        Invoice invoice1 = new Buy_Paid(1, item, "21 Mar 2019", 1, item.getPrice());
        if (invoice1 instanceof Sell_Paid)
        {
            System.out.println("Benar invoice type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, invoice type adalah Sell_Paid");
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(Item item)
    {
        Invoice invoice2 = new Buy_Paid(2, item, "21 Mar 2019", 2, item.getPrice());
        if (invoice2 instanceof Sell_Paid)
        {
            System.out.println("Benar invoice type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, invoice type adalah Sell_Paid");
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice3 = new Buy_Paid(3, item, "21 Mar 2019", 3, item.getPrice());
        if (invoice3 instanceof Sell_Paid)
        {
            System.out.println("Benar, invoice type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, invoice type bukan Sell_Paid");
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemPaid(Item item)
    {
        System.out.println("====================SELL ITEM PAID====================");
        Invoice invoice4 = new Sell_Paid(4, item, "21 Mar 2019", 4, item.getPrice());
        ItemStatus itemstatus4 = ItemStatus.Sold;
        item.setStatus(itemstatus4);
        
        item.printData();
        invoice4.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item)
    {
        System.out.println("====================SELL ITEM UNPAID====================");
        Invoice invoice5 = new Sell_Unpaid(5, item, "21 Mar 2019", 5, item.getPrice(), "30 Maret 2019");
        ItemStatus itemstatus5 = ItemStatus.Sold;
        item.setStatus(itemstatus5);

        item.printData();
        invoice5.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item)
    {
        System.out.println("====================SELL ITEM INSTALLMENT====================");
        Invoice invoice6 = new Sell_Installment(6, item, "21 Mar 2019", 6, item.getPrice(), 10, 10000);
        ItemStatus itemstatus6 = ItemStatus.Sold;
        item.setStatus(itemstatus6);

        item.printData();
        invoice6.printData();
    }
}
