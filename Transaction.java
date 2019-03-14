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
    public static void orderNewItem(Supplier supplier)
    {
        Item item1 = new Item(1, "Laptop", 10, 100000, ItemCategory.Electronics, ItemStatus.New, supplier);
        DatabaseItem.addItem(item1);
        ItemStatus itemstatus1 = ItemStatus.New;
        InvoiceStatus invoicestatus1 = InvoiceStatus.Paid;
        Invoice invoice1 = new Invoice(1, item1, "14 Mar 2019", item1.getPrice(), invoicestatus1);

        item1.setStatus(itemstatus1);
        invoice1.setInvoiceStatus(invoicestatus1);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(Supplier supplier)
    {
        Item item2 = new Item(2, "Lemari baju", 20, 200000, ItemCategory.Furniture, ItemStatus.Second, supplier);
        DatabaseItem.addItem(item2);
        ItemStatus itemstatus2 = ItemStatus.Second;
        InvoiceStatus invoicestatus2 = InvoiceStatus.Paid;
        Invoice invoice2 = new Invoice(2, item2, "14 Mar 2019", item2.getPrice(), invoicestatus2);

        item2.setStatus(itemstatus2);
        invoice2.setInvoiceStatus(invoicestatus2);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderRefurbishedItem(Supplier supplier)
    {
        Item item3 = new Item(3, "Papan jalan", 30, 300000, ItemCategory.Stationery, ItemStatus.Refurbished, supplier);
        DatabaseItem.addItem(item3);
        ItemStatus itemstatus3 = ItemStatus.Refurbished;
        InvoiceStatus invoicestatus3 = InvoiceStatus.Paid;
        Invoice invoice3 = new Invoice(3, item3, "14 Mar 2019", item3.getPrice(), invoicestatus3);

        item3.setStatus(itemstatus3);
        invoice3.setInvoiceStatus(invoicestatus3);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemPaid(Item item)
    {
        InvoiceStatus invoicestatus4 = InvoiceStatus.Paid;
        ItemStatus itemstatus4 = ItemStatus.Sold;

        Invoice invoice4 = new Invoice(4, item, "14 Mar 2019", item.getPrice(), invoicestatus4);

        invoice4.setInvoiceStatus(invoicestatus4);
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
        InvoiceStatus invoicestatus5 = InvoiceStatus.Unpaid;
        ItemStatus itemstatus5 = ItemStatus.Sold;

        Invoice invoice5 = new Invoice(5, item, "14 Mar 2019", item.getPrice(), invoicestatus5);

        invoice5.setInvoiceStatus(invoicestatus5);
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
        InvoiceStatus invoicestatus6 = InvoiceStatus.Installment;
        ItemStatus itemstatus6 = ItemStatus.Sold;

        Invoice invoice6 = new Invoice(6, item, "14 Mar 2019", item.getPrice(), invoicestatus6);

        invoice6.setInvoiceStatus(invoicestatus6);
        item.setStatus(itemstatus6);

        item.printData();
        invoice6.printData();
    }
}
