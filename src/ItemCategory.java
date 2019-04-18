
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public enum ItemCategory
{
    Electronics("Electronics"),
    Furniture("Furniture"),
    Stationery("Stationery");
    
    String category;
    
    ItemCategory(String category)
    {
        this.category = category;
    }
    
    @Override
    public String toString()
    {
        return category;
    }
}
