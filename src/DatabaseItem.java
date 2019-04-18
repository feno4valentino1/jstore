import java.util.*;

/**
 * Write a description of class DatabaseItem here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class DatabaseItem
{
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;
    
    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {
        
    }
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    /**
     * Method addItem
     *
     * @param  item
     * @return true
     */
    public static boolean addItem(Item item)
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if (item.getName().equals(itemDB.getName()) &&
            item.getStatus().equals(itemDB.getStatus()) &&
            item.getSupplier().equals(itemDB.getSupplier()))
            {
                return false;
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID=item.getId();
        return true;
    }
    public static Item getItemFromID(int id)
    {
        Item returnValue = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId() == id)
            {
                returnValue = itemDB;
            }
        }
        return returnValue;
    }
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> returnValue = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier() == supplier)
            {
                returnValue.add(itemDB);
            }
        }
        return returnValue;
    }
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> returnValue = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory() == category)
            {
                returnValue.add(itemDB);
            }
        }
        return returnValue;
    }
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> returnValue = null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus() == status)
            {
                returnValue.add(itemDB);
            }
        }
        return returnValue;
    }
    /**
     * Method removeItem
     *
     * @param  id
     * @return true
     */
    public static boolean removeItem(int id)
    {
        boolean returnValue = false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId() == id)
            {
                ITEM_DATABASE.remove(id);
                returnValue = true;
            }
        }
        return returnValue;
    }
}