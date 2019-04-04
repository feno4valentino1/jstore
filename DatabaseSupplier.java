package jstore;


/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class DatabaseSupplier
{
    private Supplier[] listSupplier;
    private Supplier supplier;

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
    public void removeSupplier(Supplier supplier)
    {
        
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
    public Supplier[] getListSupplier()
    {
    	return listSupplier;
    }
}
