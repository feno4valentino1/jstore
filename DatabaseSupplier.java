package jstore;


/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author Feno Valentino
 * @version 28 Feb 2019
 */
public class DatabaseSupplier
{
    private static String listSupplier[];
    private static Supplier supplier;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    public DatabaseSupplier()
    {
        
    }
    /**
     * Method addSupplier
     *
     * @param  supplier
     * @return true
     */
    public boolean addSupplier(Supplier supplier)
    {
    	return true;
    }
    /**
     * Method removeSupplier
     *
     * @param  supplier
     * @return true
     */
    public boolean removeSupplier(Supplier supplier)
    {
    	return true;
    }
    /**
     * Method getSupplier
     *
     * @param  -
     * @return supplier
     */
    public Supplier getSupplier()
    {
    	return supplier;
    }
    /**
     * Method getListSupplier
     *
     * @param  -
     * @return listSupplier
     */
    public String[] getListSupplier()
    {
    	return listSupplier;
    }
}
