package jstore;


/**
 * Write a description of class DatabaseItem here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class DatabaseItem
{
    private static String listItem[];
    public static Item itemDB;
    
    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {
        
    }
    /**
     * Method addItem
     *
     * @param  item
     * @return true
     */
    public static boolean addItem(Item item)
    {
        itemDB = item;
    	return true;
    }
    /**
     * Method removeItem
     *
     * @param  item
     * @return true
     */
    public static boolean removeItem(Item item)
    {
    	return true;
    }
    /**
     * Method getItem
     *
     * @param  -
     * @return itemDB
     */
    public static Item getItem()
    {
    	return itemDB;
    }
    /**
     * Method getItemDatabase
     *
     * @param  -
     * @return listItem
     */
    public static String[] getItemDatabase()
    {
    	return listItem;
    }
}