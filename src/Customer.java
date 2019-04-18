import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
        this.name = name;
        setEmail(email);
        this.username = username;
        setPassword(password);
        id = DatabaseCustomer.getLastCustomerID() + 1;
        this.birthDate = birthDate;
    }
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
        this.name = name;
        setEmail(email);
        this.username = username;
        setPassword(password);
        id = DatabaseCustomer.getLastCustomerID() + 1;
        this.birthDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public int getId()
    {
        return id;
    }
    public Calendar getBirthDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println("Birth date: " + sdf.format(birthDate.getTime()));
        return birthDate;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);  
        Matcher matcher = pattern.matcher(email);
        if (matcher.find())
        {
            this.email = email;
        }
        else
        {
            this.email = null;
        }
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.find())
        {
            this.password = password;
        }
        else
        {
            this.password = null;
        }
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate = birthDate;
    }
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        this.birthDate = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    public String toString()
    {
        return "==========Customer=========="+
        "\nID: "+id+
        "\nNama: "+name+
        "\nUsername: "+username+
        "\nEmail: "+email+
        "\nPassword: "+password;
    }
}
