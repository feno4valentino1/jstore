package jstore;


/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Feno Valentino
 * @version 14 Mar 2019
 */
public enum InvoiceStatus
{
    Paid("Paid"),
    Unpaid("Unpaid"),
    Installment("Installment");
    
    String status;
    
    InvoiceStatus(String status)
    {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return status;
    }
}
