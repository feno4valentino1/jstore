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
    
    public Location(String province, String description, String city)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    public String getProvince()
    {
        return province;
    }
    public String getCity()
    {
        return city;
    }
    public String getDescription()
    {
        return description;
    }
    public void setProvince(String province)
    {
        this.province = province;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void printData()
    {
        System.out.println(province);
    }
}