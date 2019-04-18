import java.util.*;

/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class DatabaseSupplier
{
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    public DatabaseSupplier()
    {
        
    }
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    /**
     * Method addSupplier
     *
     * @param  supplier
     * @return true
     */
    public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException
    {
        
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getEmail().equals(supplierDB.getEmail()) ||
                    supplier.getPhoneNumber().equals(supplierDB.getPhoneNumber()))
            {
                throw new SupplierAlreadyExistsException(supplier);
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }
    /**
     * Method getSupplier
     *
     * @param  -
     * @return supplier
     */
    public static Supplier getSupplier(int id)
    {
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId() == id)
            {
                return supplierDB;
            }
        }
        return null;
    }
    /**
     * Method removeSupplier
     *
     * @param  id
     * @return true
     */
    public static boolean removeSupplier(int id)
    {
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId() == id)
            {
                ArrayList<Item> itemDB = DatabaseItem.getItemFromSupplier(supplierDB);
                if (itemDB != null)
                {
                    for (Item item : itemDB)
                    {
                        try
                        {
                            DatabaseItem.removeItem(item.getId());
                        }
                        catch (ItemNotFoundException e)
                        {
                            System.out.print(e.getExMessage());
                        }
                    }
                }
                SUPPLIER_DATABASE.remove(supplierDB);
                return true;
            }
        }
        return false;
    }
}
