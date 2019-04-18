
/**
 * Write a description of class Item here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class Item
{
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, int stock, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
        id = DatabaseItem.getLastItemID() + 1;
        this.name = name;
        this.price = price;
        this.category = category;
        this.status = status;
        this.supplier = supplier;
    }
    /**
     * Method getId
     *
     * @param  -
     * @return id
     */
    public int getId()
    {
        return id;
    }
    /**
     * Method getName
     *
     * @param  -
     * @return name
     */
    public String getName()
    {
        return name;
    }
    /**
     * Method getPrice
     *
     * @param  -
     * @return price
     */
    public int getPrice()
    {
        return price;
    }
    /**
     * Method getCategory
     *
     * @param  -
     * @return category
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    /**
     * Method getStatus
     *
     * @param  -
     * @return status
     */
    public ItemStatus getStatus()
    {
        return status;
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
     * Method setId
     *
     * @param  id
     * @return -
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * Method setName
     *
     * @param  name
     * @return -
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Method setPrice
     *
     * @param  price
     * @return -
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    /**
     * Method setCategory
     *
     * @param  category
     * @return -
     */
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }
    /**
     * Method setStatus
     *
     * @param  status
     * @return -
     */
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }
    /**
     * Method setSupplier
     *
     * @param  supplier
     * @return -
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    public String toString()
    {
        return "==========ITEM=========="+
        "\nID: " + id+
        "\nName: "  + name+
        "\nCategory: " + category+
        "\nStatus: " + status+
        "\nSupplier: " + supplier.getName();
    }
}