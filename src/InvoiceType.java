
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
    Buy("Buy"),
    Sell("Sell");
    
    String invType;
    
    InvoiceType(String invType)
    {
        this.invType = invType;
    }
    
    @Override
    public String toString()
    {
        return invType;
    }
}
