package jstore;


/**
 * Write a description of class Supplier here.
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
     * Method getEmail
     *
     * @param  -
     * @return email
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * Method getPhoneNumber
     *
     * @param  -
     * @return phoneNumber
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * Method getLocation
     *
     * @param  -
     * @return location
     */
    public Location getLocation()
    {
        return location;
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
     * Method setEmail
     *
     * @param  email
     * @return -
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * Method setPhoneNumber
     *
     * @param  phoneNumber
     * @return -
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
     * Method setLocation
     *
     * @param  location
     * @return -
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
     * Method printData prints out supplier info.
     *
     * @param  -
     * @return -
     */
    public void printData()
    {
        System.out.println("==========SUPPLIER==========");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Supplier location: " + location);
        System.out.println("\n");
    }
}