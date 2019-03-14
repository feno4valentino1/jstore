package jstore;


/**
 * Write a description of class Location here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    
    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String city, String description)
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
     * Method printData prints out location info.
     *
     * @param  -
     * @return -
     */
    public void printData()
    {
        System.out.println("==========LOCATION==========");
        System.out.println("Provinsi: " + province);
        System.out.println("Kota: " + city);
        System.out.println("Deskripsi: " + description);
        System.out.println("\n");
    }
}