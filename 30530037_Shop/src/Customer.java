
import java.util.HashMap;

/**
 *
 * @author 30530037
 */
public class Customer extends User{
    
    //Attributes
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    private HashMap<Integer, Order> orders;
    
    //Constructors - 8 parameters ALL EXCEPT isRegistered
    public Customer()
    {
        super();
        addressLine1 = "20 FakeStreet";
        addressLine2 = "Flat 2/1";
        town = "Glasgow";
        postcode = "G1 A23";
        orders = new HashMap();
    }
    
    //Getters
    public String getAddressLine1()
    {
        return addressLine1;
    }
    
    public String getAddressLine2()
    {
        return addressLine2;
    }
    
    public String getTown()
    {
        return town;
    }
    
    public String getPostcode()
    {
        return postcode;
    }
    
    public boolean GetIsRegistered()
    {
        return isRegistered;
    }
    
    public HashMap<Integer, Order> getOrders()
    {
        return orders;
    }
    //Setters
    
    public void setAddressLine1(String AddressLine1In)
    {
        addressLine1 = AddressLine1In;
    }
    
    public void setAddressLine2(String AddressLine2In)
    {
        addressLine2 = AddressLine2In;
    }
    
    public void setTown(String TownIn)
    {
        town = TownIn;
    }
    
    public void setPostcode(String PostcodeIn)
    {
        postcode = PostcodeIn;
    }
    
    public void setIsRegistered(boolean isRegisteredIn)
    {
        isRegistered = isRegisteredIn;
    }
    
    public void setOrders(HashMap ordersIn)
    {
        orders = ordersIn;
    }
}
