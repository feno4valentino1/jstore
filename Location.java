package jstore;


/**
 * Write a description of class Location here.
 *
 * @author Feno Valentino
 * @version 28 Feb 2019
 */
public class Location
{
    private String province;
    private String description;
    private String city;
    
    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String description, String city)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    /**
     * Method getProvince
     *
     * @param  -
     * @return province
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * Method getCity
     *
     * @param  -
     * @return city
     */
    public String getCity()
    {
        return city;
    }
    /**
     * Method getDescription
     *
     * @param  -
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * Method setProvince
     *
     * @param  province
     * @return -
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
     * Method setCity
     *
     * @param  city
     * @return -
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
     * Method setDescription
     *
     * @param  description
     * @return -
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    /**
     * Method printData prints out "province".
     *
     * @param  -
     * @return -
     */
    public void printData()
    {
        System.out.println(province);
    }
}