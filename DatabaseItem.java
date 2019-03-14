package jstore;


/**
 * Write a description of class DatabaseItem here.
 *
 * @author Feno Valentino
 * @version 28 Feb 2019
 */
public class DatabaseItem
{
    private static String listItem[];
    private static Item item;
    
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
     * @return item
     */
    public static Item getItem()
    {
    	return item;
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