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
        Invoice invoice1 = new Buy_Paid(1, item, 1);
        if (invoice1 instanceof Sell_Paid)
        {
            System.out.println("Benar invoice type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, invoice type bukan Sell_Paid");
        }
        System.out.println();
        System.out.println("====================ORDER NEW ITEM====================");
        invoice1.printData();
        item.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(Item item)
    {
        Invoice invoice2 = new Buy_Paid(2, item, 1);
        if (invoice2 instanceof Sell_Paid)
        {
            System.out.println("Benar invoice type adalah Sell_Paid");
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
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice3 = new Buy_Paid(3, item, 1);
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
        Invoice invoice4 = new Sell_Paid(4, item, 1);
        System.out.println();
        System.out.println("====================SELL ITEM PAID====================");
        invoice4.printData();
        item.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item)
    {
        Invoice invoice5 = new Sell_Unpaid(5, item, 1, customer);
        System.out.println();
        System.out.println("====================SELL ITEM UNPAID====================");
        invoice5.printData();
        item.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item)
    {
        System.out.println();
        System.out.println("====================SELL ITEM INSTALLMENT====================");
        invoice6.printData();
        item.printData();
    }
}
