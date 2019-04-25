package jstore.controller;

import jstore.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController
{
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ArrayList<Item> itemsList()
    {
        return DatabaseItem.getItemDatabase();
    }

    @RequestMapping(value = "/items/{id_item}", method = RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id_item)
    {
        return DatabaseItem.getItemFromID(id_item);
    }
}
