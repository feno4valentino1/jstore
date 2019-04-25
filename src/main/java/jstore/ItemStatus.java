package jstore;
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public enum ItemStatus
{
    New("New"),
    Second("Second"),
    Refurbished("Refurbished"),
    Sold("Sold");
    
    String status;
    
    ItemStatus(String status)
    {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return status;
    }
}
