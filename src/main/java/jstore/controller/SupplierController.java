package jstore.controller;

import jstore.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SupplierController
{
    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public ArrayList<Supplier> supplierList()
    {
        return DatabaseSupplier.getSupplierDatabase();
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id_supplier)
    {
        return DatabaseSupplier.getSupplier(id_supplier);
    }
}
