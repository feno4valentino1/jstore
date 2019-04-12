package jstore;
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
    public boolean addSupplier(Supplier supplier)
    {
    	boolean returnValue = false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName() != supplierDB.getName() &&
            supplier.getEmail() != supplierDB.getEmail() &&
            supplier.getPhoneNumber() != supplierDB.getPhoneNumber())
            {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID = supplier.getId();
            returnValue = true;
            }
        }
        return returnValue;
    }
    /**
     * Method getSupplier
     *
     * @param  -
     * @return supplier
     */
    public Supplier getSupplier(int id)
    {
        Supplier returnValue = null;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId() == id)
            {
                returnValue = supplierDB;
            }
        }
        return returnValue;
    }
    /**
     * Method removeSupplier
     *
     * @param  supplier
     * @return true
     */
    public boolean removeSupplier(int id)
    {
        boolean returnValue = false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId() == id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                returnValue = true;
            }
        }
        return returnValue;
    }
}
