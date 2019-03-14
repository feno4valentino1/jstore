package jstore;


/**
 * Write a description of class Item here.
 *
 * @author Feno Valentino
 * @version 28 Feb 2019
 */
public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
    {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
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
     * Method getStock
     *
     * @param  -
     * @return stock
     */
    public int getStock()
    {
        return stock;
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
    public String getCategory()
    {
        return category;
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
     * Method setStock
     *
     * @param  stock
     * @return -
     */
    public void setStock(int stock)
    {
        this.stock = stock;
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
    public void setCategory(String category)
    {
        this.category = category;
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
    /**
     * Method printData prints out "name".
     *
     * @param  -
     * @return -
     */
    public void printData()
    {
        System.out.println(name);
    }
}