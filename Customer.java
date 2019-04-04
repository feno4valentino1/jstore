package jstore;
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
    public Customer(String name, String email, String username, String password, int id, Calendar birthDate)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
        this.birthDate = birthDate;
    }
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
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
            System.out.println("Email is " + matcher.group());
            this.email = email;
        }
        else
        {
            System.out.println("Email is null");
            this.email = "null";
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
            System.out.println("Password is " + matcher.group());
            this.password = password;
        }
        else
        {
            System.out.println("Password is null");
            this.password = "null";
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
    
}
