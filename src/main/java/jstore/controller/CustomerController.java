package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
public class CustomerController
{

    @RequestMapping("/")
    public String indexPage(@RequestParam(value = "name", defaultValue = "world") String name)
    {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value = "id") int id,
                            @RequestParam(value = "name") String name,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "username") String username,
                            @RequestParam(value = "password") String password,
                            @RequestParam(value = "year", defaultValue = "1999") int year)
    {
        Customer customer = new Customer(id, name, email, username, password, year, 10, 10);
        try
        {
            DatabaseCustomer.addCustomer(customer);
        }
        catch (CustomerAlreadyExistsException e)
        {
            e.getMessage();
            return null;
        }
        return customer;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id)
    {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value = "email") String email,
                              @RequestParam(value = "password") String password)
    {
        return DatabaseCustomer.getCustomerLogin(email, password);
    }


}
